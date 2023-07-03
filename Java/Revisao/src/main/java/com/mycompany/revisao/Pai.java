package com.mycompany.revisao;

public class Pai {
    private String nome;

    public Pai(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pai{" + "nome=" + nome + '}';
    }
}
