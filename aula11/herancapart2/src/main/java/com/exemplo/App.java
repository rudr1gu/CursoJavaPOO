package com.exemplo;
import com.exemplo.classes.Visitante;

public class App {
    public static void main( String[] args ){
        
        Visitante v1 = new Visitante("Juvenal", (short)22, 'M');

        v1.apresentar();
    }
}
