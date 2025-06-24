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
import br.com.krossft.scfp.repository.ContaRepository;
import br.com.krossft.scfp.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
    private final ContaRepository repository;
    private final UsuarioRepository usuarioRepository;
    private final ContaDtoAdapter contaDtoAdapter;
    private final ContaConverter contaConverter;
    
    public ContaService(ContaRepository repository, UsuarioRepository usuarioRepository, ContaDtoAdapter contaDtoAdapter, ContaConverter contaConverter) {
        this.repository = repository;
        this.usuarioRepository = usuarioRepository;
        this.contaDtoAdapter = contaDtoAdapter;
        this.contaConverter = contaConverter;
    }


    public ContaDTO criarContaAPartirDeContaDtoSimple(ContaDTOSimple contaDtoSimple) {

        ContaDTO contaDTO = contaDtoAdapter.converterParaContaDTO(contaDtoSimple);
        Usuario usuario = usuarioRepository.findById(contaDTO.getUsuario().getId()).orElse(null);
        contaDTO.setUsuario(usuario);

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

    public ContaDTO criarContaAPartirDeContaDTO(ContaDTO contaDTO) {
        Usuario usuario = usuarioRepository.findById(contaDTO.getUsuario().getId()).orElse(null);
        contaDTO.setUsuario(usuario);
        Conta conta = criarObjetoConta(contaDTO);
        Conta objetoContaPersistido = repository.save(conta);
        return contaConverter.toDTO(objetoContaPersistido);
    }

}
