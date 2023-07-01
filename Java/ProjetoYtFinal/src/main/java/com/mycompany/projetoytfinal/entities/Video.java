package com.mycompany.projetoytfinal.entities;

public class Video implements AcoesVideo{
    //Atributos
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtida;
    private boolean reproduzindo;
    
    //Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtida = 0;
        this.reproduzindo = false;
    }
    
    //Métodos
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtida ++;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(float avaliacao) {
        float nova;
        nova = (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = nova;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public int getViews() {
        return views;
    }

    public int getCurtida() {
        return curtida;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtida=" + curtida + ", reproduzindo=" + reproduzindo + '}';
    }
}
