/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.entity;

import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.enumerator.EnumTipoConta;

public class ContaFactory {
    private ContaFactory(){}

    private static Conta criarConta(ContaDTO contaDTO) {
        validarContaDto(contaDTO);

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

    private static void validarContaDto(ContaDTO contaDTO) {
        if (contaDTO == null) {
            throw new IllegalArgumentException("ContaDTO não pode ser nulo");
        }
        if (contaDTO.getNomeConta() == null || contaDTO.getNomeConta().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da conta não pode ser nulo ou vazio");
        }
        if (contaDTO.getTipoConta() == null) {
            throw new IllegalArgumentException("Tipo da conta não pode ser nulo");
        }
        if (contaDTO.getUsuario() == null || contaDTO.getUsuario().getId() == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo");
        }
    }
}

