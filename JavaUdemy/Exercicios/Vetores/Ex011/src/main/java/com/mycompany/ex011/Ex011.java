package com.mycompany.ex011;

import com.mycompany.ex011.entities.Pessoa;
import java.util.Arrays;
import java.util.Scanner;

public class Ex011 {

    public static void main(String[] args) {
        int n, contHomem = 0, contMulher = 0;
        double altura, menor, maior, soma = 0;
        char sexo;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de pessoas: ");
        n = sc.nextInt();
        
        Pessoa vetor[] = new Pessoa[n];
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("\nInforme a altura: ");
            altura = sc.nextDouble();
            
            System.out.print("Informe o sexo: ");
            sexo = sc.next().charAt(0);
            
            vetor[i] = new Pessoa(altura, sexo);
        }
        
        sc.close();
        
        menor = vetor[0].getAltura();
        maior = vetor[0].getAltura();
        
        for(int i = 0; i < vetor.length; i++) {
            if(menor > vetor[i].getAltura()) {
                menor = vetor[i].getAltura();
            }
            
            if(maior < vetor[i].getAltura()) {
                maior = vetor[i].getAltura();
            }
            
            if(vetor[i].getSexo() == 'F') {
                contMulher++;
                soma += vetor[i].getAltura();
            }
            
            if(vetor[i].getSexo() == 'M') {
                contHomem++;
            }
        }
        
        System.out.printf("\nA maior altura: %.2f \nA menor altura: %.2f", maior, menor);
        System.out.printf("\nMedia das alturas das mulheres: %.2f", (soma / contMulher));
        System.out.println("\nNumero de homens: " + contHomem);
    }
}
