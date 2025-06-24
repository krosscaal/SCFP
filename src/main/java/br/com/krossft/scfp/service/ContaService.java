/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.service;

import br.com.krossft.scfp.domain.adapter.ContaDtoAdapter;
import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.dto.ContaDTOSimple;
import br.com.krossft.scfp.domain.entity.Conta;
import br.com.krossft.scfp.domain.entity.ContaFactory;
import br.com.krossft.scfp.domain.entity.Usuario;
import br.com.krossft.scfp.domain.mapper.ContaConverter;
import br.com.krossft.scfp.exception.BusinessException;
import br.com.krossft.scfp.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContaService {
    private final ContaRepository repository;
    private final ContaDtoAdapter contaDtoAdapter;
    private final ContaConverter contaConverter;
    private final UsuarioService usuarioService;

    public ContaService(ContaRepository repository, ContaDtoAdapter contaDtoAdapter, ContaConverter contaConverter, UsuarioService usuarioService) {
        this.repository = repository;
        this.contaDtoAdapter = contaDtoAdapter;
        this.contaConverter = contaConverter;
        this.usuarioService = usuarioService;
    }


    public ContaDTO criarContaAPartirDeContaDtoSimple(ContaDTOSimple contaDtoSimple) {

        ContaDTO contaDTO = contaDtoAdapter.converterParaContaDTO(contaDtoSimple);
        Usuario usuario = usuarioService.buscarPorId(contaDTO.getUsuario().getId());
        contaDTO.setUsuario(usuario);

        return persistirConta(contaDTO);

    }
    private ContaDTO persistirConta(ContaDTO contaDTO) {
        Conta conta = criarObjetoConta(contaDTO);
        Conta objetoContaPersistido = repository.save(conta);
        return contaConverter.toDTO(objetoContaPersistido);
    }

    private Conta criarObjetoConta(ContaDTO contaDTO) {
        return switch (contaDTO.getTipoConta()) {
            case RECEITA -> ContaFactory.criarContaReceita(contaDTO);
            case DESPESA_FIXA -> ContaFactory.criarContaDespesaFixa(contaDTO);
            case DESPESA_VARIAVEL -> ContaFactory.criarContaDespesaVariavel(contaDTO);
            default -> ContaFactory.criarContaCustomizada(contaDTO);
        };
    }

    public ContaDTO criarAtualizarContaAPartirDeContaDTO(ContaDTO contaDTO) {
        Usuario usuario = usuarioService.buscarPorId(contaDTO.getUsuario().getId());
        contaDTO.setUsuario(usuario);
        return persistirConta(contaDTO);
    }

    public List<ContaDTO> listarContas() {
        List<Conta> lista = repository.findAll();
        List<ContaDTO> listaContaDTO = new ArrayList<>();
        lista.forEach(conta -> listaContaDTO.add(contaConverter.toDTO(conta)));
        return listaContaDTO;
    }

    public ContaDTO buscarPorId(Long id) {
        Conta conta = buscarContaPorId(id);
        return contaConverter.toDTO(conta);
    }

    public ContaDTO atualizar(Long id, ContaDTO contaDTO) {
        if (!contaExists(id)) {
            throw new BusinessException("Conta não existe");
        }
        Usuario usuario = usuarioService.buscarPorId(contaDTO.getUsuario().getId());
        contaDTO.setId(id);
        contaDTO.setUsuario(usuario);
        return persistirConta(contaDTO);

    }
    private Conta buscarContaPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new BusinessException("Conta Inexistente"));
    }

    public void remover(Long id) {
        Conta conta = buscarContaPorId(id);
        if (conta != null) {
            repository.deleteById(conta.getId());
        }
    }
    private boolean contaExists(Long id) {
        return repository.existsById(id);
    }
}
