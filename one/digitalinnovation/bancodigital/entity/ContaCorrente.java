package one.digitalinnovation.bancodigital.entity;

public class ContaCorrente extends Conta {

    private static final String TIPOCONTA = "Conta Corrente";

    public ContaCorrente() {
        super(TIPOCONTA);
        this.setSaldo(0.00);
    }
}
