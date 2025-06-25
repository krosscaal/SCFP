/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.entity;

import br.com.krossft.scfp.domain.enumerator.EnumAtivo;
import br.com.krossft.scfp.domain.enumerator.EnumMes;
import br.com.krossft.scfp.domain.enumerator.EnumStatusConta;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@Entity
@Table(name = "tb_movimento")
public class Movimento extends EntidadeBase{

    private BigDecimal valor;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private EnumMes referenciaMes;

    @NotNull
    private Integer referenciaAno;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EnumStatusConta statusConta;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EnumAtivo ativo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_usuario",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_conta_movimento_id_usuario"))
    private Usuario usuario;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_conta_nome",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_conta_movimento_id_conta_nome"))
    private Conta contaNome;

    protected Movimento() {}

}
