package com.exemplo.classes;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;


    public Aluno(String nome, short idade, char sexo) {
        super(nome, idade, sexo);
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
