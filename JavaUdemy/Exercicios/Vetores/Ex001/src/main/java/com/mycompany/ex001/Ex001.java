package com.mycompany.ex001;

import com.mycompany.ex001.entities.Pessoa;
import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        //Variáveis
        int qnt, idade;
        String nome;
        double altura, soma = 0, cont = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serão digitada: ");
        qnt = sc.nextInt();
        
        Pessoa vetor[] = new Pessoa[qnt];
        
        //Preenche vetor
        for(int i = 0; i < vetor.length; i++) {
           //Limpa o buffer do teclado
           sc.nextLine();
        
           System.out.println("================================================");
           System.out.printf("Informe o nome da %da pessoa: ", i + 1);
           nome = sc.nextLine();
           
           System.out.print("Idade: ");
           idade = sc.nextInt();
           if(idade < 16) {
               cont++;
           }
            
           System.out.print("Altura: ");
           altura = sc.nextDouble();
           soma += altura;
           
           vetor[i] = new Pessoa(nome, idade, altura);  
        }
        
        sc.close();
        
        System.out.println("================================================");
        System.out.printf("A altura média é %.2fm. \nPessoa com menos de 16 anos: %.2f%%. \nNome de pessoas com menos de 16:\n", (soma / vetor.length), (cont / vetor.length) * 100);
        
        //Laço para exibir nome
        for(int i = 0; i< vetor.length; i++) {
            if(vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }
    }
}
