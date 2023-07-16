package com.mycompany.matriz;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Matriz {

    public static void main(String[] args) {
        //Variáveis
        int n, cont = 0, soma = 0;
        List<Integer> diagPrin = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a ordem da matriz: ");
        n = sc.nextInt();
        
        int matriz[][] = new int[n][n];
        
        //Laço para preencher a matriz
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        sc.close();
        
        System.out.println("\nImprimindo matriz");
        //Laço para imprimir
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
                if(i == j) {
                    diagPrin.add(matriz[i][j]);
                    soma += matriz[i][j];
                }
                if(matriz[i][j] < 0) {
                        cont++;
                    }
            }
            System.out.println("");
        }
        
        //Laço para impimir a diagonal principal
        System.out.println("\nDiagonal principal: ");
        for(int x : diagPrin) {
            System.out.print(x + " ");
        }
        
        System.out.println("\n\nSoma da diagonal principal: " + soma + "\nNúmeros negativos: " + cont);
    }
}