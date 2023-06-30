package com.mycompany.aula011;

public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos
    public void receberAum(float aumento) {
        this.salario += aumento;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }
}
