/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.dto;

import br.com.krossft.scfp.domain.entity.Conta;
import br.com.krossft.scfp.domain.entity.Usuario;
import br.com.krossft.scfp.domain.enumerator.EnumAtivo;
import br.com.krossft.scfp.domain.enumerator.EnumMes;
import br.com.krossft.scfp.domain.enumerator.EnumStatusConta;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MovimentoDTO {
    private Long id;
    private BigDecimal valor;
    private EnumMes referenciaMes;
    private Integer referenciaAno;
    private EnumStatusConta statusConta;
    private EnumAtivo ativo;
    private Usuario usuario;
    private Conta contaNome;
}
