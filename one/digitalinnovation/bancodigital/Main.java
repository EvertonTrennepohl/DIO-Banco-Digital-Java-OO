package one.digitalinnovation.bancodigital;

import one.digitalinnovation.bancodigital.entity.Conta;
import one.digitalinnovation.bancodigital.entity.ContaCorrente;
import one.digitalinnovation.bancodigital.entity.ContaPoupanca;
import one.digitalinnovation.bancodigital.service.BancoService;
import one.digitalinnovation.bancodigital.service.ContaService;

public class Main {

    public static void main (String[] args) {
        Conta contaPoupanca = new ContaPoupanca();
        Conta contaCorrente = new ContaCorrente();
        ContaService contaService = new ContaService();
        contaService.depositar(contaPoupanca, 530.00);
        contaService.saldo(contaPoupanca);
        contaService.depositar(contaCorrente, 300.00);
        contaService.saldo(contaCorrente);
        contaService.transferir(contaPoupanca, contaCorrente, 100.00);
        contaService.saldo(contaPoupanca);
        contaService.saldo(contaCorrente);
        contaService.sacar(contaPoupanca, 230.00);
        contaService.saldo(contaPoupanca);
        contaService.sacar(contaPoupanca, 400.00);
        BancoService bancoService = new BancoService();
        bancoService.listarContas();
    }
}
