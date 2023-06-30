package com.mycompany.projetopessoas;

public class Aluno extends Pessoa{
    
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos
    public void cancelarMatr() {
        if(this.getMatricula() != 0) {
            this.setMatricula(0);
        }
        else {
            System.out.println("O aluno já está desmatriculado!");
        }
    }
    
    //Métodos especiais
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
