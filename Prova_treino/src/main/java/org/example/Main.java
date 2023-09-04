package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ninja [] ninja = new Ninja[50];
        Aldeia aldeia = new Aldeia();

        int numNinjas;
        Scanner sc = new Scanner(System.in);

        aldeia.nome = "Folha";
        aldeia.regiao = "Sul";

        System.out.println("Quantidade de ninjas a serem adicionados: ");
        numNinjas = sc.nextInt();

        for (int i = 0; i < numNinjas; i++) {
            aldeia.adicionarNinja(new Ninja());
        }

        aldeia.mostraInfo();

        aldeia.rankingS();

        aldeia.qtdTitulos();
    }
}