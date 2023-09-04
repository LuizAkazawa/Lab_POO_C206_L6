package org.example;

public class Main {
    public static void main(String[] args) {
//composição e agregação -> prova

       // Arma armete = new Arma();
        //armete.tipo = "Fogo";
        //armete.poder = 20;

        Nave navinha = new Nave("Xwing", 200, "Fogo", 20);

        //navinha.addArma(armete);

        System.out.println(navinha.arma.tipo);
        System.out.println(navinha.arma.poder);

    }
}