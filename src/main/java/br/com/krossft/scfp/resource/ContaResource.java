/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.resource;

import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.dto.ContaDTOSimple;
import br.com.krossft.scfp.exception.BusinessException;
import br.com.krossft.scfp.service.ContaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaResource extends ResourceBase<ContaDTO, Long>{

    @Autowired
    private ContaService contaService;


    @Override
    protected ResponseEntity<ContaDTO> acaObter(Long id) throws BusinessException {
        return ResponseEntity.ok(contaService.buscarPorId(id));
    }

    @Override
    protected ResponseEntity<List<ContaDTO>> acaoListar() throws BusinessException {
        return ResponseEntity.ok(contaService.listarContas());
    }

    @Override
    protected ResponseEntity<ContaDTO> acaoIncluir(ContaDTO dto) throws BusinessException {
        return ResponseEntity.ok(contaService.criarContaAPartirDeContaDTO(dto));
    }

    @Override
    protected ResponseEntity<ContaDTO> acaoAtualizar(Long id, ContaDTO dto) throws BusinessException {
        return ResponseEntity.ok(contaService.atualizar(id, dto));
    }

    @Override
    protected void acaoRemover(Long id) throws BusinessException {
        contaService.remover(id);
    }

    @Transactional
    @PostMapping(value = "/simple")
    public ResponseEntity<ContaDTO> criarConta(@RequestBody ContaDTOSimple contaDtoSimple) {
        return ResponseEntity.ok(contaService.criarContaAPartirDeContaDtoSimple(contaDtoSimple));
    }
}
