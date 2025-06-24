/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.dto;

import br.com.krossft.scfp.domain.enumerator.EnumRoleUsuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private EnumRoleUsuario role;

}
