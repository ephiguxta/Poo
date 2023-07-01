package com.mycompany.projetoytfinal.entities;

public class Visualizacao {
    //Atributos - Agregação
    private Gafanhoto espectador;
    private Video filme;
    
    //Métodos
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public Video getFilme() {
        return filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(float nota) {
        this.filme.setAvaliacao(nota);
    }
}
