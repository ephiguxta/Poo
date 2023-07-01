package com.mycompany.funcionario_contratado;

import java.util.Scanner;

public class Funcionario_Contratado {

    public static void main(String[] args) {
        int n, hours;
        String name;
        double valuePerHour, addtionalValue;
        char op;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        n = sc.nextInt();
        
        Employee v[] = new Employee[n];
        
        for(int i = 0; i < n; i++) {
            System.out.println("######EMPLOYEE " + (i + 1) + " DATA######");
            
            System.out.print("Outsourced? (y/n): ");
            op = sc.next().charAt(0);
            sc.nextLine();
            
            if(op == 'n') {
                
                System.out.print("Name: ");
                name = sc.next();
            
                System.out.print("Hours: ");
                hours = sc.nextInt();
            
                System.out.print("Value per hours: ");
                valuePerHour = sc.nextDouble();
                
                v[i] = new Employee(name, hours, valuePerHour);
            }
            else {
                System.out.print("Name: ");
                name = sc.next();
            
                System.out.print("Hours: ");
                hours = sc.nextInt();
            
                System.out.print("Value per hours: ");
                valuePerHour = sc.nextDouble();
                
                System.out.print("Addtional value: ");
                addtionalValue = sc.nextDouble();
                
                v[i] = new OutsourcedEmployee(addtionalValue, name, hours, valuePerHour);
            }
        }
        
        System.out.println();
        
        System.out.println("PAYEMENTS");
        
        for(int i = 0; i < n; i++) {
            System.out.println(v[i].getName() + " " + " " + v[i].payment());
        }
    }
}
