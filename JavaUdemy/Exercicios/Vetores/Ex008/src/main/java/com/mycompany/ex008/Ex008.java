package com.mycompany.ex008;

import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {
        //Atributos
        int n, soma = 0, cont = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        n = sc.nextInt();
        
        int vetor[] = new int[n];
        
        //Armazena dados no vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        
        sc.close();
        
        //Soma dos números pares
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                soma += vetor[i];
                cont++;
            }
        }
        
        if(soma == 0) {
            System.out.println("Nenhum número par!");
        }
        else {
            System.out.println("Media dos pares: " + (soma / cont));
        }
    }
}
