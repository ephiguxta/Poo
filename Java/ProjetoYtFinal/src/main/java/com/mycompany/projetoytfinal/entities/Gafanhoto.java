package com.mycompany.projetoytfinal.entities;

public class Gafanhoto extends Pessoa{
    //Atributos
    private String login;
    private int totAssistido;
    
    //Construtor
    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //Métodos
    public void setLogin(String login) {
        this.login = login;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }    
}
