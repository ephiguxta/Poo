package com.mycompany.aula013;

import com.mycompany.aula013.entities.Cachorro;

public class Aula013 {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("ola");
        c.reagir("Vai apanhar");
        c.reagir(11,45);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
