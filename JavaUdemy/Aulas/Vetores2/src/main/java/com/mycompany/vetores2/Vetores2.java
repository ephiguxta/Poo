package com.mycompany.vetores2;

import com.mycompany.vetores2.entities.Produto;
import java.util.Scanner;

public class Vetores2 {

    public static void main(String[] args) {
        
        //Declaração das variáveis
        String nomeProduto;
        double precoProduto, soma = 0;
        int tamanhoVetor;
        
        Scanner sc = new Scanner(System.in);
        
        //Registra tamanho do vetor
        System.out.print("Informe o tamanho do vetor: ");
        tamanhoVetor = sc.nextInt();
        
        //Aloca o tamanho do vetor
        Produto vetor[] = new Produto[tamanhoVetor];
        
        //Preenche o vetor
        for(int i = 0; i < tamanhoVetor; i++) {
            System.out.println("==================Preencha===================");
            
            System.out.print("Informe o nome do produto: ");
            
            //Pega o buffer do teclado
            sc.next();
            
            nomeProduto = sc.nextLine();
            
            System.out.print("Informe o preço do produto: ");
            precoProduto = sc.nextDouble();
            
            vetor[i] = new Produto(nomeProduto, precoProduto);
        }
        
        for(int i = 0; i < tamanhoVetor; i++) {
            soma = soma + vetor[i].getPreco();
        }
        
        System.out.println("===================Média=====================");
        System.out.printf("A média dos preços é de R$ %.2f%n", (soma / vetor.length));
        
        sc.close();
    }
}
