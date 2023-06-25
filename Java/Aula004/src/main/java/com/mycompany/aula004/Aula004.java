package com.mycompany.aula004;

public class Aula004 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarela", 0.4f);
  
        
        System.out.println("Seu modelo é " + c1.getModelo());
        System.out.println("Sua ponta é " + c1.getPonta());
        System.out.println("Sua cor é " +  c1.getCor());
        System.out.println("Está tampada? " + c1.getTampa());
    }
}
