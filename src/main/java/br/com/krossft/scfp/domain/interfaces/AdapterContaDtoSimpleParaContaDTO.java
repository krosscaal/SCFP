/*
 * Author: Krossby Adhemar Camacho Alviz
 *
 */

package br.com.krossft.scfp.domain.interfaces;

import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.dto.ContaDTOSimple;

public interface AdapterContaDtoSimpleParaContaDTO {
    ContaDTO converterParaContaDTO(ContaDTOSimple contaDtoSimple);
    ContaDTOSimple converterParaContaDtoSimple(ContaDTO contaDTO);

}
