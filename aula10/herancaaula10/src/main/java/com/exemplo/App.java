package com.exemplo;
import com.exemplo.classes.*;


public class App {
    public static void main( String[] args ){

        Pessoa p1 = new Pessoa("João", 25, 'M');
        Aluno p2 = new Aluno("Maria", 18, 'F');
        Professor p3 = new Professor("Carlos", 45, 'M');
        Funcionario p4 = new Funcionario("Ana", 33, 'F');
        
        System.out.println("");
        p1.apresentar();
        p2.apresentar();
        p3.apresentar();
        p4.apresentar();

        p2.setCurso("Informática");
        p3.setSalario(2500);
        p4.setSetor("Estoque");

        p2.setMatricula("2020");
        p3.setEspecialidade("Programação");
        p4.mudarTrabalho();

        p3.receberAumento(200);
        p1.fazerAniversario();
        
        System.out.println("");


    }
}
