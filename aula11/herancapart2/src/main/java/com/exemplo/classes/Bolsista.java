package com.exemplo.classes;

public  final class Bolsista extends Aluno{
    private String bolsa;

    public Bolsista(String nome, short idade, char sexo) {
        super(nome, idade, sexo);
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
    
}
