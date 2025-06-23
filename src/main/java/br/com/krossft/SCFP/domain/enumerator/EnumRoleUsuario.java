/*
 * Author: Krossby Adhemar Camacho Alviz
 *
 */

package br.com.krossft.SCFP.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public enum EnumRoleUsuario {
    ADMIN("Administrador"),
    BASICO("Básico");

    private final String descricao;

}
