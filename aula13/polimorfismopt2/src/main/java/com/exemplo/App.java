package com.exemplo;
import com.exemplo.classes.Cachorro;

public class App {
    public static void main( String[] args ){
        Cachorro c = new Cachorro(35.3f, 5, 4);
        c.emitirSom();
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
    }
}
