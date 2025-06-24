/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.SCFP.domain.entity;

import br.com.krossft.SCFP.domain.enumerator.EnumRoleUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario extends EntidadeBase {
    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 50)
    @Email
    private String email;

    @Size(min = 6, max = 15)
    @Column(nullable = false, length = 15)
    private String senha;

    @Column(nullable = false, length = 15)
    private String telefone;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumRoleUsuario role;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public EnumRoleUsuario getRole() {
        return role;
    }

    public void setRole(EnumRoleUsuario role) {
        this.role = role;
    }
}
