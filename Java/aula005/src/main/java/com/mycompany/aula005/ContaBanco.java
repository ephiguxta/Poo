package com.mycompany.aula005;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean estado;
    private float saldo;

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.estado = false;
        this.saldo = 0f;
    }
    
    public void abrirConta() {
        if(this.estado == false) {
            this.estado = true;
            
            if(this.tipo == "cc") {
                this.saldo = 50f;
            }
            else {
                this.saldo = 150f;
            }
        }
    }
    
    public void fecharConta() {
        this.estado = false;
    }
    
    public void depositar(float quantidade) {
        if(quantidade <= 0) {
            System.out.println("Operação inválidada, tente novamente!");
        }
        else {
            this.saldo += quantidade;
            System.out.println("Operação realizada com sucesso!");
        }
    }
    
    public void sacar(float quantidade) {
        if(quantidade > this.saldo){
            System.out.println("Operação inválida, saldo insuficiente!");
        }
        else {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque realizado com sucesso!");
        }
    }
    
    public void pagarMensal() {
        if(this.saldo > 0 && this.isEstado()) {
            if(this.tipo == "cc") {
                sacar(12);
            }
            else {
                sacar(20);
            }
        }
        else {
            System.out.println("Impossível pagar conta!");
        }
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public boolean isEstado() {
        return estado;
    }

    public float getSaldo() {
        return saldo;
    }
}
