package com.exemplo.models;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void viuMaisUm() {
        this.totAssistido++;
    }

    @Override
    public void ganharExp() {
        super.ganharExp();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}
