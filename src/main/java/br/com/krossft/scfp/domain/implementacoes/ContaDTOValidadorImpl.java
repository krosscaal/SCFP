/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.implementacoes;

import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.interfaces.ContaDTOValidador;

public class ContaDTOValidadorImpl implements ContaDTOValidador {
    @Override
    public void validarContaDTO(ContaDTO contaDTO) {
        if (contaDTO == null) {
            throw new IllegalArgumentException("ContaDTO não pode ser nulo");
        }
        if (contaDTO.getNomeConta() == null || contaDTO.getNomeConta().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da conta não pode ser nulo ou vazio");
        }
        if (contaDTO.getTipoConta() == null) {
            throw new IllegalArgumentException("Tipo da conta não pode ser nulo");
        }
        if (contaDTO.getUsuario() == null || contaDTO.getUsuario().getId() == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo");
        }
    }
}
