package com.mycompany.aula002;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A ponta: " + this.ponta);
        System.out.println("Sua carge é de " + this.carga);
    }
    
    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar!");
        }
        else {
            System.out.println("Rabiscando...");
        }
    }
    
    protected void tampar() {
        this.tampada = true;
    }
    
    protected void destampar() {
        this.tampada = false;
    }
}
