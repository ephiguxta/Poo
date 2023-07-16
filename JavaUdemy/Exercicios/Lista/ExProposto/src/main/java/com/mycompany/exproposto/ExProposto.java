package com.mycompany.exproposto;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.mycompany.exproposto.entities.Empregado;
import java.util.stream.Collectors;

public class ExProposto {

    public static void main(String[] args) {
        //Variáveis
        int n;
        boolean repetido = false;
        Integer id;
        String nome;
        Double salario, porcentagem;
        Scanner sc = new Scanner(System.in);
        
        //Lista
        List<Empregado> lista = new ArrayList<>();
        
        System.out.print("Informe a quantidade de empregados a serem registrados: ");
        n = sc.nextInt();
        
        System.out.println("================================");
        
        for(int i = 0; i < n; i++) {
            System.out.println("\nEmpregado #" + (i + 1) + ": ");
            
            
            System.out.print("Id: ");
            id = sc.nextInt();
            
            sc.nextLine();
            
            System.out.print("Nome: ");
            nome = sc.nextLine();
            
            System.out.print("Salario: ");
            salario = sc.nextDouble();
            
            //Buscador de id repetido
            for(Empregado x : lista) {
                if(x.getId() == id) {
                    repetido = true;
                    System.out.println("\nId repetido, programa finalizado!");
                    break;
                }
            }
             
            if(repetido == false) {
                Empregado empregado = new Empregado(id, nome, salario);
                lista.add(empregado);
            }
            
            repetido = false;
        }
        
        System.out.println("\nLista de empregados:");
        
        //Lista de empregados:
        for(Empregado empregado : lista) {
            System.out.println(empregado);
        }
        
        System.out.print("\nInforme o id do funcionário para aumentar o salário: ");
        id = sc.nextInt();
        
        System.out.print("Informe a porcentagem a ser aumentada: ");
        porcentagem = sc.nextDouble();
        
        sc.close();
        
        //Verifica se o id está na lista
        for(Empregado x  : lista) {
            if(x.getId() == id) {
                x.aumentarSalario(porcentagem);
            }
        }
        
        System.out.println("\nLista de empregados:");
        
        //Lista de empregados:
        for(Empregado empregado : lista) {
            System.out.println(empregado);
        }
    }
}
