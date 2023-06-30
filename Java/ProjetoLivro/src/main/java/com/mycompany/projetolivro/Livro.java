package com.mycompany.projetolivro;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa pessoa;

    public Livro(String titulo, String autor, int totPag, Pessoa pessoa) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.pessoa = pessoa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public boolean isAberto() {
        return aberto;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        if(this.isAberto()) {
            this.setAberto(false);
        }
        else {
            System.out.println("Já está fechado!");
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPaf() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
