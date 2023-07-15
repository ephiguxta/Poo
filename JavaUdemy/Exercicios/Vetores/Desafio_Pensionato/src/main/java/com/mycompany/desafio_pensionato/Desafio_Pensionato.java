package com.mycompany.desafio_pensionato;

import com.mycompany.desafio_pensionato.entities.Aluguel;
import java.util.Scanner;

public class Desafio_Pensionato {

    public static void main(String[] args) {
        //Variáveis
        int n, quarto;
        final int quantidade = 10;
        String nome, email;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Temos 10 quartos disponíveis! \nQuantos quartos serão alugados: ");
        n = sc.nextInt();
        
        Aluguel vagas[] = new Aluguel[quantidade];
        
        //Aponta para região de memória com os quartos
        for(int i = 0; i < n; i++) {
            System.out.println("====================================================");
            sc.nextLine();
            
            System.out.print("Nome: ");
            nome = sc.nextLine();
            
            System.out.print("Email: ");
            email = sc.nextLine();
            
            System.out.print("Quarto: ");
            quarto = sc.nextInt();
            
            vagas[quarto] = new Aluguel(nome, email, quarto);
        }
        
        sc.close();
        
        //Exibi os quartos alugados em ordem
        System.out.println("\nQuartos ocupados: ");
        
        for(int i = 0; i < vagas.length; i++) {
            if(vagas[i] != null) {
                System.out.println(i + ": " + vagas[i].getNome() + ", " + vagas[i].getEmail());
            }
        }
    }
}
