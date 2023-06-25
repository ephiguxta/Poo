package com.mycompany.aula005;

public class Aula005 {

    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco(789, "cc", "Aroldo Rodas");
        
        p1.abrirConta();
        
        System.out.println(p1.getDono());
        System.out.println(p1.getNumConta());
        System.out.println(p1.getSaldo());
        System.out.println(p1.getTipo());
        System.out.println(p1.isEstado());
    }
}
