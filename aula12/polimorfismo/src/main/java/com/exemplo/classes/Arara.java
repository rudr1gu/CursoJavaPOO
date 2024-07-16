package com.exemplo.classes;

public class Arara extends Ave {
    public Arara(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println("ahaa ahahaaaa ararraaaaa");
    }
    
}
