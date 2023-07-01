package com.mycompany.aula012;

public class Ave extends Animal{
    //Atributos
    private String corPena;
    
    //Métodos

    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da ave.");
    }
    
    public void fazerNinho() {
        System.out.println("Fazendo ninho!!!");
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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

    public String getCorPena() {
        return corPena;
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
