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

    public static EnumTipoConta fromOrdinal(int ordinal) {
        for (EnumTipoConta tipo : EnumTipoConta.values()) {
            if (tipo.getOrdinalConta() == ordinal) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de conta não encontrado para o ordinal: " + ordinal);
    }

}
