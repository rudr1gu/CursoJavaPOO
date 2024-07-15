package com.exemplo.models;

public class Pessoa implements IPessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private String rg;

    public Pessoa(String nome, int idade, String sexo, String cpf, String rg) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setCpf(cpf);
        this.setRg(rg);
    }

    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return this.idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getSexo() {
        return this.sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String getRg() {
        return this.rg;
    }
    @Override
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String apresentar(){
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\nCPF: " + this.getCpf() + "\nRG: " + this.getRg();
    }

}