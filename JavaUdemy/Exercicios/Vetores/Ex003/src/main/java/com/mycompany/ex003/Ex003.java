package com.mycompany.ex003;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        //Variáveis
        int n, soma = 0, media;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de números do vetor: ");
        n = sc.nextInt();
        
        //Aloca espaço no vetor
        int vetor[] = new int[n];
        
        //Preenche vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digete um número: ");
            vetor[i] = sc.nextInt();
        }
        
        //Exibe os valores do vetor
        System.out.print("\nValores = ");
        for(int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            System.out.print(" " + vetor[i]);
        }
        
        System.out.printf("\nSoma = %d", soma);
        System.out.printf("\nMedia = %d", soma / vetor.length);
    }
}
