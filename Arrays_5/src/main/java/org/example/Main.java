package org.example;

public class Main {
    public static void main(String[] args) {

        //array de primitivos
        //int [] numeros = {1, 3, 45, 56, 67, 90};

        //System.out.println(numeros[0]);

        /*
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/

        /*
        for (int numero:numeros) {
            System.out.println(numero);
        }
        */

        //Arrays do tipo Conta
        Conta [] contas = new Conta[5];

        //instanciando conta do Luiz
        Conta c1 = new Conta("Luiz", 1000.40);
        contas[0] = c1;
        //instanciando conta do Victor (primeira forma)
        contas[1] = new Conta("Victor", 100.35);


        /*
        NÃO RECOMENDADO PQ NEM TODOS OS ESPAÇOS DO ARRAY ESTÃO OCUPADOS (dá na mesma que o outro for) -> ???????
        for (Conta c: contas) {
            System.out.println(c.dono);
        }
        */

        for (int i = 0; i < contas.length; i++) {
            if(contas[i] == null){
                contas[i] = c1;
            }
        }

        for (Conta c: contas) {
            System.out.println(c.dono);
            System.out.println(c.saldo);
        }
        /*
        for (int i = 0; i < contas.length; i++) {
            if(contas[i] != null){
                System.out.println(contas[i].dono);
                System.out.println(contas[i].saldo);
            }
        }
        */
        //github -> acrenno
    }
}