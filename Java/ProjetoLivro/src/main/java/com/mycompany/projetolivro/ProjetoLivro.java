package com.mycompany.projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "Masculino");
        p[1] = new Pessoa("Maria", 25, "Feminino");
        
        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("Poo para iniciantes", "Pedro Paulo", 500, p[1]);
        
        System.out.println(l[0].getPagAtual());
        l[0].avancarPag();
        System.out.println(l[0].getPagAtual());
    }
}
