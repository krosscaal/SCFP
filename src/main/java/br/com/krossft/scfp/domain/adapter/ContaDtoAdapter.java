/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.adapter;

import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.dto.ContaDTOSimple;
import br.com.krossft.scfp.domain.entity.Usuario;
import br.com.krossft.scfp.domain.enumerator.EnumTipoConta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContaDtoAdapter {

    public ContaDTO converterParaContaDTO(ContaDTOSimple contaDtoSimple) {
        if (contaDtoSimple == null) {
            throw new IllegalArgumentException("ContaDtoSimple não pode ser nulo");
        }

        return criarContaDto(contaDtoSimple);
    }

    private ContaDTO criarContaDto(ContaDTOSimple contaDtoSimple) {
        ContaDTO contaDTO = new ContaDTO();

        contaDTO.setNomeConta(contaDtoSimple.getNomeConta());

        if (contaDtoSimple.getTipoConta() != null) {
            contaDTO.setTipoConta(EnumTipoConta.fromOrdinal(contaDtoSimple.getTipoConta()));
        }

        if (contaDtoSimple.getUsuario() != null) {
            Usuario usuario = new Usuario();
            usuario.setId(contaDtoSimple.getUsuario());
            contaDTO.setUsuario(usuario);
        }

        return contaDTO;
    }

    public ContaDTOSimple converterParaContaDtoSimple(ContaDTO contaDTO) {
        if (contaDTO == null) {
            throw new IllegalArgumentException("ContaDTO não pode ser nulo");
        }

        return criarContaDtoSimple(contaDTO);
    }

    private ContaDTOSimple criarContaDtoSimple(ContaDTO contaDTO) {
        ContaDTOSimple contaDtoSimple = new ContaDTOSimple();

        contaDtoSimple.setNomeConta(contaDTO.getNomeConta());

        if (contaDTO.getTipoConta() != null) {
            contaDtoSimple.setTipoConta(contaDTO.getTipoConta().getOrdinalConta());
        }

        if (contaDTO.getUsuario() != null) {
            contaDtoSimple.setUsuario(contaDTO.getUsuario().getId());
        }

        return contaDtoSimple;
    }
}


