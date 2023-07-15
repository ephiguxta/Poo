package com.mycompany.desafio_pensionato.entities;

public class Aluguel {
    //Atributos
    String nome;
    String email;
    int quarto;
    
    //Construtor
    public Aluguel(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }
    
    //Métodos especiais
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getQuarto() {
        return quarto;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "nome=" + nome + ", email=" + email + ", quarto=" + quarto + '}';
    }
}
