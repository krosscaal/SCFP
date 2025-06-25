/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.service;

import br.com.krossft.scfp.domain.dto.MovimentoDTO;
import br.com.krossft.scfp.domain.entity.Movimento;
import br.com.krossft.scfp.domain.entity.MovimentoFactory;
import br.com.krossft.scfp.domain.mapper.MovimentoConverter;
import br.com.krossft.scfp.exception.BusinessException;
import br.com.krossft.scfp.repository.MovimentoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimentoService {
    private final MovimentoRepository repository;
    private final MovimentoConverter converter;

    public MovimentoService(MovimentoRepository repository, MovimentoConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public MovimentoDTO buscarPorId(Long id) {
        Movimento movimento = buscarMovimentoPotId(id);
        return converter.toDTO(movimento);
    }

    private Movimento buscarMovimentoPotId(Long id) {
        return repository.findById(id).orElseThrow(()-> new BusinessException("Movimento não encontrado"));
    }

    public List<MovimentoDTO> listarMovimentos() {
        List<Movimento> movimentos = repository.findAll();
        List<MovimentoDTO> listaMovimentosDto = new ArrayList<>();
        movimentos.forEach(movimento -> listaMovimentosDto.add(converter.toDTO(movimento)));
        return listaMovimentosDto;
    }
    public MovimentoDTO criarAtualizarMovimento(MovimentoDTO dto) {
        return persistirMovimento(dto);
    }

    private MovimentoDTO persistirMovimento(MovimentoDTO dto) {
        Movimento movimento = MovimentoFactory.criarMovimento(dto);
        Movimento movimentoObjtPersistido = repository.save(movimento);
        return converter.toDTO(movimentoObjtPersistido);
    }
    public MovimentoDTO atualizarMovimento(Long id, MovimentoDTO dto) {
        if (!movimentoExists(id)) {
            throw new BusinessException("Movimento para ser atualizado, não existe");
        }
        dto.setId(id);
        return criarAtualizarMovimento(dto);
    }
    private boolean movimentoExists(Long id) {
        return repository.existsById(id);
    }
    public void removerMovimento(Long id) {
        if (!movimentoExists(id)) {
            throw new BusinessException("Movimento não existe para ser removido!");
        }
        repository.deleteById(id);
    }
}
