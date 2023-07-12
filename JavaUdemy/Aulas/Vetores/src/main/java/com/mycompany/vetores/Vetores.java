package com.mycompany.vetores;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double soma = 0;
        
        System.out.println("Informe o tamanho do vetor: ");
        n = sc.nextInt();
        
        double v[] = new double[n];
        
        //Laço para pegar os valores e somar
        for(int i = 0; i < n; i++) {
            System.out.println("Informe o valor a ser adicionado no vetor: ");
            v[i] = sc.nextDouble();
            soma = soma + v[i];
        }
        
        System.out.printf("A média é %.2f%n.", (soma / n));
        
        sc.close();
    }
}
