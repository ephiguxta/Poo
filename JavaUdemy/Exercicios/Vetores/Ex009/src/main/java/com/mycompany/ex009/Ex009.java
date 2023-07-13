package com.mycompany.ex009;

import java.util.Scanner;
import com.mycompany.ex009.entities.Pessoa;

public class Ex009 {

    public static void main(String[] args) {
        int n, idade, maisVelhoInt;
        String nome, maisVelho;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de pessoas: ");
        n = sc.nextInt();
        
        //Aloca espaço no vetor
        Pessoa vetor[] = new Pessoa[n];
        
        //Armazena os dados no vetor
        for(int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            
            System.out.printf("Dados da %d pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nome = sc.nextLine();
            
            System.out.print("Idade: ");
            idade = sc.nextInt();
            
            vetor[i] = new Pessoa(nome, idade);
        }
        
        sc.close();
        
        maisVelho = vetor[0].getNome();
        maisVelhoInt = vetor[0].getIdade();
        
        //Percorre o vetor e armazena o nome do mais velho
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i].getIdade() > maisVelhoInt) {
                maisVelhoInt = vetor[i].getIdade();
                maisVelho = vetor[i].getNome();
            }
        }
        
        System.out.println("O mais velho se chama " + maisVelho + " e possui " + maisVelhoInt + " anos.");
    }
}
