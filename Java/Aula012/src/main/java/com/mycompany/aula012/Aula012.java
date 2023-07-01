package com.mycompany.aula012;

public class Aula012 {

    public static void main(String[] args) {
         Mamifero m = new Mamifero();
         Reptil r = new Reptil();
         Peixe p = new Peixe();
         Ave a = new Ave();
         
         m.setPeso(85.3f);
         m.setIdade(2);
         m.setMembros(4);
         m.locomover();
         m.emitirSom();
         m.alimentar();
         
         p.setPeso(0.35f);
         p.setIdade(1);
         p.setMembros(0);
         p.locomover();
         p.emitirSom();
         p.alimentar();
    }
}
