package com.mycompany.ex004;

import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
        //Vetores
        int n, cont = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        n = sc.nextInt();
        
        //Aloca espaço no vetor
        int vetor[] = new int[n];
        
        //Preenche o vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        
        sc.close();
        
        System.out.println("Números pares: ");
        //Percorre vetor
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.print(" " + vetor[i]);
                cont++;
            }
        }
        
        System.out.println("\nQuantidade de números pares: " + cont);
    }
}
