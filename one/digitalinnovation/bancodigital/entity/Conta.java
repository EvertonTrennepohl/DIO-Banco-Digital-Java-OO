package one.digitalinnovation.bancodigital.entity;

public abstract class Conta {

    private static final int AGENCIA_PADRAO =1;
    private static int SEQUENCIAL = 1;

    private String tipoConta;
    private int agencia;
    private int conta;
    private double saldo;

    public Conta(String tipo) {
        this.tipoConta = tipo;
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL;
        Banco.addConta(this);
        SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}
