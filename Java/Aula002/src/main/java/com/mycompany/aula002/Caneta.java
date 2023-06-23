package com.mycompany.aula002;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A ponta: " + this.ponta);
        System.out.println("Sua carge é de " + this.carga);
    }
    
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar!");
        }
        else {
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
