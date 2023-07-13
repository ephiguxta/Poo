package com.mycompany.ex011.entities;

public class Pessoa {
    //Atributos
    double altura;
    char sexo;
    
    //Construtor
    public Pessoa(double altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public char getSexo() {
        return sexo;
    }
    
}
