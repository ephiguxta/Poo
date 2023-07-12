package com.mycompany.ex002;

import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {
        int qunatidade, numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números você vai digitar? ");
        qunatidade = sc.nextInt();
        
        int v[] = new int[qunatidade];
        
        for(int i = 0; i < v.length; i++) {
            System.out.print("Diite um número: ");
            numero = sc.nextInt();
            v[i] = numero;
        }
        
        System.out.println("Números negativos: ");
        
        for(int i = 0; i < v.length; i++) {
            if(v[i] < 0) {
                System.out.println(v[i]);
            }
        }
        
    }
}
