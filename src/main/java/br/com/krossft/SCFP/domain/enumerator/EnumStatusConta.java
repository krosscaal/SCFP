/*
 * Author: Krossby Adhemar Camacho Alviz
 *
 */

package br.com.krossft.SCFP.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumStatusConta {
    PAGO("Pago"),
    PENDENTE("Pendente"),
    RECEBIDO("Recebido"),
    NAO_RECEBIDO("Não Recebido");

    private final String descricao;

}
