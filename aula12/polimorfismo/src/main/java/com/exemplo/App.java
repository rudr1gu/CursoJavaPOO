package com.exemplo;
import com.exemplo.classes.*;

public class App {
    public static void main( String[] args ) {
        Mamifero m = new Mamifero(85.3f, 2, 4);
        Reptil r = new Reptil(10.0f, 1, 4);
        Peixe p = new Peixe(0.35f, 1, 0);
        Ave a = new Ave(0.89f, 2, 2);
        Canguru c = new Canguru(55.30f, 3, 4);
        Cachorro k = new Cachorro(3.94f, 5, 4);
        Cobra j = new Cobra(1.5f, 4, 0);
        Tartaruga t = new Tartaruga(12.5f, 100, 4);
        Goldfish g = new Goldfish(0.1f, 1, 0);
        Arara e = new Arara(1.5f, 6, 2);
        
        System.out.println("\n--------------------------------------------\n");
        m.alimentar();
        m.emitirSom();
        m.locomover();
        System.out.println("\n--------------------------------------------\n");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        System.out.println("\n--------------------------------------------\n");
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("\n--------------------------------------------\n");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        System.out.println("\n--------------------------------------------\n");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("\n--------------------------------------------\n");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println("\n--------------------------------------------\n");
        j.locomover();
        j.alimentar();
        j.emitirSom();
        System.out.println("\n--------------------------------------------\n");
        t.locomover();
        t.alimentar();
        t.emitirSom();
        System.out.println("\n--------------------------------------------\n");
        g.locomover();
        g.alimentar();
        g.emitirSom();
        System.out.println("\n--------------------------------------------\n");
        e.locomover();
        e.alimentar();
        e.emitirSom();
        System.out.println("\n--------------------------------------------\n");
        

     
    }
}
