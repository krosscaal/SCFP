/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.implementacoes;

import br.com.krossft.scfp.domain.dto.MovimentoDTO;
import br.com.krossft.scfp.domain.interfaces.MovimentoDTOValidador;

import java.math.BigDecimal;

public class MovimentoDTOValidadorImpl implements MovimentoDTOValidador {
    private static final int ANO_MINIMO = 2000;

    @Override
    public void validarMovimentoDTO(MovimentoDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("MovimentoDTO não pode ser nulo");
        }
        if (dto.getValor() == null || dto.getValor().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        if (dto.getReferenciaMes() == null) {
            throw new IllegalArgumentException("Mês de referência não pode ser nulo");
        }
        if (dto.getReferenciaAno() == null || dto.getReferenciaAno() < ANO_MINIMO) {
            throw new IllegalArgumentException("Ano de referência inválido");
        }
        if (dto.getContaNome() == null) {
            throw new IllegalArgumentException("Movimento nãp possue conta");
        }
        if (dto.getUsuario() == null || dto.getUsuario().getId() == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo");
        }

    }
}
