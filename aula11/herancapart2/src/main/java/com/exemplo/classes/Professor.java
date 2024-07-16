package com.exemplo.classes;

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;

    public Professor(String nome, short idade, char sexo) {
        super(nome, idade, sexo);
    }

    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
