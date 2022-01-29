package one.digitalinnovation.bancodigital.entity;

import java.util.LinkedList;
import java.util.List;

public class Banco {

    private static String nome = "Banco DIO";
    private static List<Conta> contas = new LinkedList<>();

    public static String getNome() {
        return nome;
    }

    public static List<Conta> getContas() {
        return contas;
    }

    public static void addConta(Conta conta) {
        contas.add(conta);
    }

}
