package one.digitalinnovation.bancodigital.service;

import one.digitalinnovation.bancodigital.entity.Conta;

public interface IContaService {

    public void sacar(Conta conta, double valor);

    public void depositar(Conta conta, double valor);

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor);

    public void saldo(Conta conta);

}
