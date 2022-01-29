package one.digitalinnovation.bancodigital.service;

import one.digitalinnovation.bancodigital.entity.Conta;

public class ContaService implements IContaService {

    @Override
    public void sacar(Conta conta, double valor) {
        this.mostrarDadosConta(conta);
        if(saque(conta, valor)) {
            System.out.printf("\n\tSaque de R$ %.2f realizado com sucesso!\n\n", valor);
        } else {
            System.out.println("\n\tSaldo insuficiente!\n\n");
        }
    }

    @Override
    public void depositar(Conta conta, double valor) {
        this.mostrarDadosConta(conta);
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.printf("\n\tDepósito de R$ %.2f realizado com sucesso!\n\n", valor);
    }

    @Override
    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        this.mostrarDadosConta(contaOrigem);
        if(this.saque(contaOrigem, valor)) {
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.printf("\n\tValor R$ %.2f transferido para a %s número: %d\n\n",
                    valor, contaDestino.getTipoConta(), contaDestino.getConta());
        }
    }
    @Override
    public void saldo(Conta conta) {
        mostrarDadosConta(conta);
        System.out.printf("\n\tSaldo atual..........R$ %.2f\n\n", conta.getSaldo());
    }

    private void mostrarDadosConta(Conta conta) {
        System.out.printf("Agencia: %d  ||  Conta: %s  || Número: %d",
                conta.getAgencia(),conta.getTipoConta(), conta.getConta());
    }

    private boolean saque(Conta conta, double valor) {
        if(conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
