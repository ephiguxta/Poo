package com.mycompany.aula011;

public class Tecnico extends Aluno{
    //Atributos
    private String registroProfissional;
    
    //Métodos
    public void praticar() {
        System.out.println("Praticando...");
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }
}
