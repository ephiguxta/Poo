package com.mycompany.ex005;

import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
        int n, maior, posicao;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        n = sc.nextInt();
        
        int vetor[] = new int[n];
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        
        sc.close();
        
        maior = vetor[0];
        posicao = 1;
        for(int i = 0; i < vetor.length; i++ ) {
            if(maior < vetor[i]) {
                maior = vetor[i];
                posicao = 1 + i;
            }
        }
        
        System.out.println("\nMaior valor: " + maior + "\nPosicao do maior valor: " + posicao);
    }
}
