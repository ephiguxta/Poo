package com.mycompany.lista;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        
        lista.add("Mateus");
        lista.add("Marcos");
        lista.add("Lucas");
        lista.add("João");
        
        //Imprime a lista
        for(String nome : lista) {
            System.out.println(nome);
        }
        
        System.out.println("=====================================");
        
        //Filtrar quem começa com M
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        
        for(String nome : resultado) {
            System.out.println(nome);
        }
        
        System.out.println("=====================================");
        
        //Remoção por meio de um predicado, função lambda
        lista.removeIf(x -> x.charAt(0) == 'M');
        
        for(String nome : lista) {
            System.out.println(nome);
        }
        
        System.out.println("=====================================");
        
        //Encontrar primeiro elemento com uma condição
        String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);
    }
}
