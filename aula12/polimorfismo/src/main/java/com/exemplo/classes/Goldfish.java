package com.exemplo.classes;

public class Goldfish extends Peixe {
    public Goldfish(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }
    
}
