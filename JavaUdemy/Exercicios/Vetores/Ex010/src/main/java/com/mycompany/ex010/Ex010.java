package com.mycompany.ex010;

import com.mycompany.ex010.entities.Aluno;

import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {
        int n;
        String nome;
        double nota1, nota2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de alunos a serem digitados: ");
        n = sc.nextInt();
        
        Aluno vetor[] = new Aluno[n];
        
        for(int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            
            System.out.printf("\nInforme o nome da %d pessoa: ", i + 1);
            nome = sc.nextLine();
            
            System.out.print("Informe a primeira nota: ");
            nota1 = sc.nextDouble();
            
            System.out.print("Informe a primeira nota: ");
            nota2 = sc.nextDouble();
            
            vetor[i] = new Aluno(nome, nota1, nota2);
        }
        
        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < vetor.length; i++) {
            if(((vetor[i].getNota1() + vetor[i].getNota2()) / 2) >= 6) {
                System.out.println(vetor[i].getNome());
            }
        }
    }
}
