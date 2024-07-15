package com.exemplo;

import com.exemplo.models.Livro;
import com.exemplo.models.Pessoa;

public class App {
    public static void main( String[] args ){
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[4];

        p[0] = new Pessoa("Pedro", 22, "M", "111.111.111-11", "222.222.222-22");
        p[1] = new Pessoa("Maria", 25, "F", "333.333.333-33", "444.444.444-44");
        p[2] = new Pessoa("João", 30, "M", "555.555.555-55", "666.666.666-66");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[2]);
        l[3] = new Livro("PHP", "David Flanagam", 400, p[0]);


        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(200);
        System.out.println(l[1].detalhes());


    }
}
