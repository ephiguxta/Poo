package com.mycompany.ex006;

import java.util.Scanner;

public class Ex006 {

    public static void main(String[] args) {
        //Variáveis
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        n = sc.nextInt();
        
        int vetorA[] = new int[n];
        int vetorB[] = new int[n];
        
        //Armazena elementos do vetor A
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = sc.nextInt();
        }
        
        //Armazena elementos do vetorB
        for(int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite os valores do vetor B: ");
            vetorB[i] = sc.nextInt();
        }
        
        sc.close();
        
        //Soma o vetorA e o vetorB, armazenando no vetorA e exibi o novo valor de vetorA
        System.out.println("Vetor resultante: ");
        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] += vetorB[i];
            System.out.println(vetorA[i]);
        }
    }
}
