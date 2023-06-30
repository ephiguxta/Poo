package com.mycompany.aula011;

public class Bolsista extends Aluno{
    //Atributos
    private float bolsa;
    
    //Métodos
    public void renovarBolsa() {
        System.out.println("Bolsa de " + getNome() + " renovada!");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista, pagamento facilitado!");
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }
    
}