package com.exemplo.classes;

public class Cobra extends Reptil {
    public Cobra(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    
}
