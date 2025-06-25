/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.entity;

import br.com.krossft.scfp.domain.dto.MovimentoDTO;
import br.com.krossft.scfp.domain.enumerator.EnumAtivo;
import br.com.krossft.scfp.domain.enumerator.EnumStatusConta;
import br.com.krossft.scfp.domain.implementacoes.MovimentoDTOValidadorImpl;
import br.com.krossft.scfp.domain.interfaces.MovimentoDTOValidador;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MovimentoFactory {

    private static final MovimentoDTOValidador movimentoDTOValidador = new MovimentoDTOValidadorImpl();

    public static Movimento criarMovimento(MovimentoDTO dto) {
        movimentoDTOValidador.validarMovimentoDTO(dto);

        Movimento movimento = new Movimento();

        movimento.setValor(dto.getValor());
        movimento.setReferenciaMes(dto.getReferenciaMes());
        movimento.setReferenciaAno(dto.getReferenciaAno());
        movimento.setStatusConta(dto.getStatusConta() != null ?
                dto.getStatusConta() : EnumStatusConta.PENDENTE);
        movimento.setAtivo(dto.getAtivo() != null ?
                dto.getAtivo() : EnumAtivo.SIM);
        movimento.setUsuario(dto.getUsuario());
        movimento.setContaNome(dto.getContaNome());

        return movimento;
    }

    public static Movimento criarMovimentoPago(MovimentoDTO dto) {
        Movimento movimento = criarMovimento(dto);
        movimento.setStatusConta(EnumStatusConta.PAGO);
        return movimento;
    }

    public static Movimento criarMovimentoPendente(MovimentoDTO dto) {
        Movimento movimento = criarMovimento(dto);
        movimento.setStatusConta(EnumStatusConta.PENDENTE);
        return movimento;
    }

    public static Movimento criarMovimentoNoRecebido(MovimentoDTO dto) {
        Movimento movimento = criarMovimento(dto);
        movimento.setStatusConta(EnumStatusConta.NAO_RECEBIDO);
        return movimento;
    }
    public static Movimento criarMovimentoRecebido(MovimentoDTO dto) {
        Movimento movimento = criarMovimento(dto);
        movimento.setStatusConta(EnumStatusConta.RECEBIDO);
        return movimento;
    }
}
