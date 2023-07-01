package com.mycompany.aula012;

public class Reptil extends Animal{
    //Atributos
    private String corEscama;
    
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Réptil.");
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public float getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }
    
}
