package com.mycompany.aula012;

public class Canguro extends Mamifero{
    //Métodos
    public void usarBolsa() {
        System.out.println("Usando bolsa!");
    }
    
    @Override
    public void locomover() {
        System.out.println("Saltando.");
    }
}
