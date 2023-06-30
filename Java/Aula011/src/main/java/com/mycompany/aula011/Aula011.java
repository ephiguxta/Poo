package com.mycompany.aula011;

public class Aula011 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        v1.setIdade(15);
        v1.setNome("Aroldo");
        v1.setSexo('m');
        System.out.println(v1.toString());
        
        a1.setNome("Carlos");
        a1.setMatricula(1111);
        a1.setIdade(16);
        a1.setCurso("Informática");
        a1.setSexo('m');
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        b1.setNome("Jubis");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setSexo('m');
        b1.pagarMensalidade();
    }
}
