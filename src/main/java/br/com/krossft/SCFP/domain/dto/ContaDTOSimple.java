/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.SCFP.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaDTOSimple {
    private String nomeConta;

    private Integer tipoConta;

    private Long usuario;
}
