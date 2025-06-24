/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumAtivo {
    SIM("Sim"),
    NAO("Não");

    private final String descricao;

}
