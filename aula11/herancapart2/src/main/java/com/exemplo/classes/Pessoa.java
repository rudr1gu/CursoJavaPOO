package com.exemplo.classes;

public abstract class Pessoa {
    private String nome;
    private short idade;
    private char sexo;

    public Pessoa(String nome, short idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void apresentar(){
        System.out.println("\nOlá, eu sou " + this.getNome() + ", tenho " + this.getIdade() + " anos e sou do sexo " + this.getSexo());
    }

    public final void fazerAniversario(){
        this.idade++;
    }
    
}
