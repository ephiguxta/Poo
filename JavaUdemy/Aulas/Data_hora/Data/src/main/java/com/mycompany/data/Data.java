package com.mycompany.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Data {

    public static void main(String[] args) {
        
        //Tipo padrão de dados dd-MM-yyyy
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Tipo padrão de dados dd-MM-yyyy HH:mm
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                
        //Instância objeto do tipo date
        LocalDate d01 = LocalDate.now();
        //Istância usando horas e segundos
        LocalDateTime d02 = LocalDateTime.now();
        //Instância de data-hora global
        Instant d03 = Instant.now();
        //Texto para data
        LocalDate d04 = LocalDate.parse("2022-07-20");
        
        //Passando um formato de data customizável
        LocalDate d05 = LocalDate.parse("20/07/2022", fmt1);
        //Formato de data customizado com hora
        LocalDateTime d06 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        
        //Data a partir de variáveis separadas
        LocalDate d07 = LocalDate.of(2023, 7, 26);
        
        System.out.println("Local " + d01);
        System.out.println("Local com hora " + d02);
        System.out.println("Global " + d03);
        System.out.println("Texto para data " + d04);
        System.out.println("Texto da data no formato brasil " + d05);
        System.out.println("Texto da data no formato brasil com hora " + d06);
        System.out.println("Data utilizando variável separada " + d07);
    }
}
