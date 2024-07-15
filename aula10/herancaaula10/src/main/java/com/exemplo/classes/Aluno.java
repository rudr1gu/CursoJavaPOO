package com.exemplo.classes;

public class Aluno extends Pessoa{

    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada");
    }
    

    
}
