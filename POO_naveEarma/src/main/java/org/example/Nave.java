package org.example;

public class Nave {
    //Atributos da nave
    String nome;
    int velocidade;
    Arma arma = null;

    public Nave(String nome, int velocidade, String tipo, int poder) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.arma = new Arma(tipo, poder);
    }

    //Métodos da nave
    public void mostraInfo(){
        System.out.println("Nome da nave: " + nome);
        System.out.println("Velocidade da nave: " + velocidade);
    }

    /*
    public void addArma(Arma arma){
        System.out.println("Arma adicionada");
        this.arma = arma;
    }*/

}
