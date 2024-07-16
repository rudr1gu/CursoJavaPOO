package com.exemplo.classes;

public class Canguru extends Mamifero {
    public Canguru(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
}
