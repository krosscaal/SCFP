/*
 * Author: Krossby Adhemar Camacho Alviz
 *
 */

package br.com.krossft.scfp.domain.interfaces;

import br.com.krossft.scfp.domain.dto.MovimentoDTO;

public interface MovimentoDTOValidador {
    void validarMovimentoDTO(MovimentoDTO movimento);
}
