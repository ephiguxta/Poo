package com.mycompany.projetopessoas;

public class Funcionario extends Pessoa {
    
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos
    public void mudarTrabalho() {
        this.setTrabalhando(!this.isTrabalhando());
    }
    
    //Métodos especiais
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }
}
