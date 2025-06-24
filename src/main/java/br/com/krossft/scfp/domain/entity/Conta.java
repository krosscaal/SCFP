/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.entity;

import br.com.krossft.scfp.domain.enumerator.EnumTipoConta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_conta")
public class Conta extends EntidadeBase {

	@Column(nullable = false, length = 100)
	private String nomeConta;

	@Enumerated(EnumType.STRING)
	private EnumTipoConta tipoConta;

	@ManyToOne
	@JoinColumn(name = "id_usuario",
			referencedColumnName = "id",
			foreignKey = @ForeignKey(name = "fk_conta_nome_id_usuario"))
	private Usuario usuario;

	protected Conta(){}
}
