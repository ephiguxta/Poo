package com.mycompany.ex007;

import java.util.Scanner;

public class Ex007 {

    public static void main(String[] args) {
        //Variáveis
        int n;
        double soma = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        n = sc.nextInt();
        
        double vetor[] = new double[n];
        
        //Armazena elementos do vetor e soma
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        
        sc.close();
        
        //Reaza a comparação se é menor que a média e imprime
        System.out.printf("\nA média do vetor é %.3f. \n", soma / vetor.length );
        System.out.println("Elementos abaixo da média: ");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] < (soma / vetor.length)) {
                System.out.println(vetor[i]);
            }
        }
    }
}
