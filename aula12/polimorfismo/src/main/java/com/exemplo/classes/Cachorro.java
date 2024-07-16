package com.exemplo.classes;

public class Cachorro extends Mamifero {
    public Cachorro(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }

    @Override // Sobrescrevendo o método emitirSom da classe Mamifero
    public void emitirSom() {
        System.out.println("Au au");
    }
    
}
