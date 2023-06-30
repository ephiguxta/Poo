package com.mycompany.aula007;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    public void apresentar() {
        System.out.println("Ludator: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    
    public void status() {
        System.out.println("Ludator: " + getNome());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    
    public void perderLuta() {
        setVitorias(getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(this.peso);
        
    }
    
    private void setCategoria(float peso) {
        if(peso < 52.2) {
            this.categoria = "Inválido!";
        }
        else {
            if(peso <= 70.3) {
                this.categoria = "Leve";
            }
            else {
                if(peso <= 83.9) {
                    this.categoria = "Médio";
                }
                else {
                    if(peso <= 120.0) {
                        this.categoria = "Pesado";
                    }
                }
            }
        }
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }
}