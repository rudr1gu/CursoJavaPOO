package com.exemplo.models;

public interface IPessoa {
    public String getNome();
    public void setNome(String nome);
    public int getIdade();
    public void setIdade(int idade);
    public String getSexo();
    public void setSexo(String sexo);
    public String getCpf();
    public void setCpf(String cpf);
    public String getRg();
    public void setRg(String rg);
    public void fazerAniversario();
    public String apresentar();
}
