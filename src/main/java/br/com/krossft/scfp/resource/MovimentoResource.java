/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.resource;

import br.com.krossft.scfp.domain.dto.MovimentoDTO;
import br.com.krossft.scfp.exception.BusinessException;
import br.com.krossft.scfp.service.MovimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovimentoResource extends ResourceBase<MovimentoDTO, Long> {
    @Autowired
    private MovimentoService movimentoService;

    @Override
    protected ResponseEntity<MovimentoDTO> acaObter(Long id) throws BusinessException {
        return ResponseEntity.ok(movimentoService.buscarPorId(id));
    }

    @Override
    protected ResponseEntity<List<MovimentoDTO>> acaoListar() throws BusinessException {
        return ResponseEntity.ok(movimentoService.listarMovimentos());
    }

    @Override
    protected ResponseEntity<MovimentoDTO> acaoIncluir(MovimentoDTO dto) throws BusinessException {
        return ResponseEntity.ok(movimentoService.criarAtualizarMovimento(dto));
    }

    @Override
    protected ResponseEntity<MovimentoDTO> acaoAtualizar(Long id, MovimentoDTO dto) throws BusinessException {
        return ResponseEntity.ok(movimentoService.atualizarMovimento(id, dto));
    }

    @Override
    protected void acaoRemover(Long id) throws BusinessException {
        movimentoService.removerMovimento(id);
    }
}
