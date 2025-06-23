/*
 * Author: Krossby Adhemar Camacho Alviz
 *
 */

package br.com.krossft.SCFP.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumTipoConta {
    RECEITA(1,"Receita"),
    DESPESA_FIXA(2,"Despesa Fixa"),
    DESPESA_VARIAVEL(3,"Despesa Variavel");

    private final int ordinalConta;
    private final String descricaoConta;


}
