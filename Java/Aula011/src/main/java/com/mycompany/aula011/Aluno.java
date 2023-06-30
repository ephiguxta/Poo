package com.mycompany.aula011;

public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno!");
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
