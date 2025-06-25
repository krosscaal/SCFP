/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.adapter;

import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.dto.ContaDTOSimple;
import br.com.krossft.scfp.domain.entity.Usuario;
import br.com.krossft.scfp.domain.enumerator.EnumTipoConta;
import br.com.krossft.scfp.domain.interfaces.AdapterContaDtoSimpleParaContaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContaDtoAdapter implements AdapterContaDtoSimpleParaContaDTO {
    @Override
    public ContaDTO converterParaContaDTO(ContaDTOSimple contaDtoSimple) {
        validarContaDtoSimpleNaoNulo(contaDtoSimple);
        return new ContaDTOBuilder()
                .comNomeConta(contaDtoSimple.getNomeConta())
                .comTipoConta(contaDtoSimple.getTipoConta())
                .comUsuario(contaDtoSimple.getUsuario())
                .build();

    }

    @Override
    public ContaDTOSimple converterParaContaDtoSimple(ContaDTO contaDTO) {
        validarContaDtoNaoNulo(contaDTO);
        return new ContaDTOSimpleBuilder()
                .comNomeConta(contaDTO.getNomeConta())
                .comTipoConta(contaDTO.getTipoConta())
                .comUsuario(contaDTO.getUsuario())
                .build();

    }

    private void validarContaDtoSimpleNaoNulo(ContaDTOSimple contaDtoSimple) {
        if (contaDtoSimple == null) {
            throw new IllegalArgumentException("ContaDtoSimple não pode ser nulo");
        }
    }

    private void validarContaDtoNaoNulo(ContaDTO contaDTO) {
        if (contaDTO == null) {
            throw new IllegalArgumentException("ContaDTO não pode ser nulo");
        }
    }
    private static class ContaDTOBuilder {
        private final ContaDTO contaDTO;

        public ContaDTOBuilder() {
            this.contaDTO = new ContaDTO();
        }

        public ContaDTOBuilder comNomeConta(String nomeConta) {
            contaDTO.setNomeConta(nomeConta);
            return this;
        }

        public ContaDTOBuilder comTipoConta(Integer tipoConta) {
            if (tipoConta != null) {
                contaDTO.setTipoConta(EnumTipoConta.fromOrdinal(tipoConta));
            }
            return this;
        }

        public ContaDTOBuilder comUsuario(Long usuarioId) {
            if (usuarioId != null) {
                Usuario usuario = new Usuario();
                usuario.setId(usuarioId);
                contaDTO.setUsuario(usuario);
            }
            return this;
        }

        public ContaDTO build() {
            return contaDTO;
        }
    }
    private static class ContaDTOSimpleBuilder {
        private final ContaDTOSimple contaDtoSimple;

        public ContaDTOSimpleBuilder() {
            this.contaDtoSimple = new ContaDTOSimple();
        }

        public ContaDTOSimpleBuilder comNomeConta(String nomeConta) {
            contaDtoSimple.setNomeConta(nomeConta);
            return this;
        }

        public ContaDTOSimpleBuilder comTipoConta(EnumTipoConta tipoConta) {
            if (tipoConta != null) {
                contaDtoSimple.setTipoConta(tipoConta.getOrdinalConta());
            }
            return this;
        }

        public ContaDTOSimpleBuilder comUsuario(Usuario usuario) {
            if (usuario != null) {
                contaDtoSimple.setUsuario(usuario.getId());
            }
            return this;
        }

        public ContaDTOSimple build() {
            return contaDtoSimple;
        }
    }
}


