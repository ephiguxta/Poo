package com.mycompany.aula006;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    //Metodos abstratos
    @Override
    public void ligar() {
        if(isLigado() == false) {
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if(isLigado() == true) {
            this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        
        for(int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() == true) {
            this.setVolume(this.getVolume() + 10);
        }
        else {
            System.out.println("TV desligada.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() == true && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 10);
        }
        else {
            System.out.println("TV desligada.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() == true) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() == true && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && this.isTocando() == false) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() == true && this.isTocando() == true) {
            this.setTocando(false);
        }
    }
}
