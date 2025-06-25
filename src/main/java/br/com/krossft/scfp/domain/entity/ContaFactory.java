/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.entity;

import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.enumerator.EnumTipoConta;
import br.com.krossft.scfp.domain.implementacoes.ContaDTOValidadorImpl;

public class ContaFactory {

    private static final ContaDTOValidadorImpl contaDTOValidador = new ContaDTOValidadorImpl();
    private ContaFactory(){}

    private static Conta criarConta(ContaDTO contaDTO) {
        contaDTOValidador.validarContaDTO(contaDTO);

        Conta conta = new Conta();
        conta.setNomeConta(contaDTO.getNomeConta());
        conta.setTipoConta(contaDTO.getTipoConta());
        conta.setUsuario(contaDTO.getUsuario());

        return conta;
    }

    public static Conta criarContaReceita(ContaDTO contaDTO) {
        contaDTO.setTipoConta(EnumTipoConta.RECEITA);
        return criarConta(contaDTO);
    }

    public static Conta criarContaDespesaFixa(ContaDTO contaDTO) {
        contaDTO.setTipoConta(EnumTipoConta.DESPESA_FIXA);
        return criarConta(contaDTO);
    }

    public static Conta criarContaDespesaVariavel(ContaDTO contaDTO) {
        contaDTO.setTipoConta(EnumTipoConta.DESPESA_VARIAVEL);
        return criarConta(contaDTO);
    }
    public static Conta criarContaCustomizada(ContaDTO contaDTO) {
        return criarConta(contaDTO);
    }
}

