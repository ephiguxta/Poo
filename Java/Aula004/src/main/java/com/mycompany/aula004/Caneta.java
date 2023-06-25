package com.mycompany.aula004;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //Construtor
    public Caneta(String m, String c, float p) {
        this.tampar();
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
    }
    
    //Pega modelo
    public String getModelo() {
        return this.modelo;
    }
    
    //Define modelo
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    //Pega ponta
    public float getPonta() {
        return this.ponta;
    }
    
    //Define ponta
    public void setponta(float p) {
        this.ponta = p;
    }
    
    //Tampar
    public void tampar() {
        this.tampada = true;
    }
    
    //Destampar
    public void destampar() {
        this.tampada = false;
    }
    
    //Retornar se esta tampada
    public boolean getTampa() {
        return this.tampada;
    }
    
    //Retorna cor
    public String getCor() {
        return this.cor;
    }
}
