package com.mycompany.aula011;

public abstract class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    //Métodos
    public final void fazerAniv() {
        this.idade += 1;
    }
    
    //Métodos especiais
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }
}
