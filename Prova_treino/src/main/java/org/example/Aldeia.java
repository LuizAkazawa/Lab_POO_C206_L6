package org.example;

import java.util.Scanner;

public class Aldeia {
    String nome;
    int qtdMoradores = 0;
    String regiao;
    Ninja [] ninjas = new Ninja[50];
    Scanner sc = new Scanner(System.in);

    void adicionarNinja(Ninja ninja){
        System.out.println("========================");
        for (int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] == null){
                ninjas[i] = ninja;
                System.out.println("NOME");
                ninjas[i].nome = sc.nextLine();
                System.out.println("IDADE");
                ninjas[i].idade = sc.nextInt();
                sc.nextLine();
                System.out.println("TITULO");
                ninjas[i].titulo = sc.nextLine();
                System.out.println("RANKING");
                ninjas[i].ranking = sc.nextLine();
                qtdMoradores+=1;
                break;
            }
        }
        System.out.println("========================");
    }

    void mostraInfo(){
        System.out.println("========================");
        System.out.println("Nome Aldeia: " + nome);
        System.out.println("Quantidade de moradores: " + qtdMoradores);
        System.out.println("Regiao: " + regiao);
        System.out.println("Ninjas presentes na aldeia: ");
        for (Ninja ninja: ninjas) {
            if(ninja != null){
                System.out.println("Nome: " + ninja.nome);
            }
        }
        System.out.println("========================");
    }

    void rankingS(){
        System.out.println("========================");
        System.out.println("Ninjas Ranking S: ");
        for (Ninja ninja: ninjas) {
            if(ninja != null){
                if (ninja.ranking.equals("S")) {
                    System.out.println(ninja.nome);
                }
            }
        }
        System.out.println("========================");
    }

    void qtdTitulos(){
        System.out.println("========================");
        int gennin = 0;
        int chunnin = 0;
        int anbu = 0;
        for (Ninja ninja: ninjas) {
            if(ninja != null){

                if(ninja.titulo.equals("Gennin")){
                    gennin+=1;
                }else if(ninja.titulo.equals("Chunnin")){
                    chunnin+=1;
                }else if(ninja.titulo.equals("Anbu")){
                    anbu+=1;
                }
            }
        }

        System.out.println("Gennin = " + gennin);
        System.out.println("Chunnin = " + chunnin);
        System.out.println("Anbu = " + anbu);
        System.out.println("========================");
    }
}
