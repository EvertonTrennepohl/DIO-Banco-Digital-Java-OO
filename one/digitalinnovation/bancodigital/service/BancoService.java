package one.digitalinnovation.bancodigital.service;

import one.digitalinnovation.bancodigital.entity.Banco;

public class BancoService {

    public BancoService(){
    }

    public void listarContas() {
        Banco.getContas().forEach(System.out::println);
    }
}
