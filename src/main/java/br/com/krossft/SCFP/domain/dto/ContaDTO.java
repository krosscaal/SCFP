/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.SCFP.domain.dto;

import br.com.krossft.SCFP.domain.entity.Usuario;
import br.com.krossft.SCFP.domain.enumerator.EnumTipoConta;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaDTO {
    @Size(min = 4, max = 100)
    private String nomeConta;

    private EnumTipoConta tipoConta;

    private Usuario usuario;

}
