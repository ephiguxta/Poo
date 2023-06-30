package com.mycompany.aula007;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria() == l1.getCategoria() && l1 != l2) {
            this.aprovada = true;
            setDesafiado(l1);
            setDesafiante(l2);            
        }
        else {
            this.aprovada = true;
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    
    public void lutar() {
        if(this.aprovada) {
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor) {
                case 0:
                    System.out.println("EMPATE!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 2:
                    System.out.println("Desafiado ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 3:
                    System.out.println("Desafiante ganhou!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            } 
        }
        else {
            System.out.println("Luta não pode acontecer!");
        }
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    
    
}
