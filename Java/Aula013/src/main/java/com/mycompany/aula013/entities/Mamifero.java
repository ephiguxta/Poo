package com.mycompany.aula013.entities;

public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;

    //Métodos
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero.");
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
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

    public String getCorPelo() {
        return corPelo;
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
