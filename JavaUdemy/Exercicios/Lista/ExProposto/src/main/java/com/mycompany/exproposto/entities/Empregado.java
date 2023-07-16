package com.mycompany.exproposto.entities;

public class Empregado {
    //Atributos
    private Integer id;
    private String nome;
    private Double salario;
    
    //Construtor
    public Empregado(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    
    //Métodos
    public void aumentarSalario(Double porcentagem) {
        setSalario(salario * (1 + (porcentagem / 100)));
    }
    
    //Métodos especiais
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return id + ", " + nome + ", " + salario;
    }
    
    
}
