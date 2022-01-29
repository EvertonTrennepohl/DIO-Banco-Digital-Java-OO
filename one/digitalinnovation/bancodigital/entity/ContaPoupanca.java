package one.digitalinnovation.bancodigital.entity;

public class ContaPoupanca extends Conta {

    private static final String TIPOCONTA = "Conta Poupança";

    public ContaPoupanca() {
        super(TIPOCONTA);
        this.setSaldo(0.00);
    }
}
