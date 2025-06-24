/*
 * Author: Krossby Adhemar Camacho Alviz
 *
 */

package br.com.krossft.scfp.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumMes {
    JANEIRO( 1,"Janeiro"),
    FEVEREIRO(2,"Fevereiro"),
    MARCO(3,"Março"),
    ABRIL(4,"Abril"),
    MAIO(5,"Maio"),
    JUNHO(6,"Junho"),
    JULHO(7,"Julho"),
    AGOSTO(8,"Agosto"),
    SETEMBRO(9,"Setembro"),
    OUTUBRO(10,"Outubro"),
    NOVEMBRO(11,"Novembro"),
    DEZEMBRO(12,"Dezembro");

    private final int valor;
    private final String descricaoMes;

    public static EnumMes valueOf(final int ord){
        return values()[ord];
    }

}
