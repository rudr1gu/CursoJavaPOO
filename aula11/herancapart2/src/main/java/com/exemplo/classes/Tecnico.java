package com.exemplo.classes;

public final class Tecnico extends Aluno{
    private String registroProfissional;

    public Tecnico(String nome, short idade, char sexo) {
        super(nome, idade, sexo);
    }

    public void praticar(){
        System.out.println("O técnico " + this.getNome() + " está praticando.");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
