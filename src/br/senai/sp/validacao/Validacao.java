package br.senai.sp.validacao;

import java.util.Scanner;

public class Validacao {

    public static void main(String[] args) {

        /** Import Scanner */
        Scanner teclado = new Scanner(System.in);

//        System.out.println("Olá, qual o seu nome: ");
//        String nome = teclado.nextLine();
//
//        System.out.println("Bem vindo(a) " + nome + ", qual é a sua idade: ");
//        int idade = teclado.nextInt();
//
//        if(idade >= 18){
//            System.out.println("Boa balada !!!");
//        } else {
//            System.out.println("Entrada não permitida !!");
//        }

        System.out.println("Digite um numero: ");
//        int numero = teclado.nextInt();

        boolean valida = false;

        while(!valida) {

            if (teclado.hasNextInt()) {
                int numero = teclado.nextInt();
                valida = true;

                if (numero % 2 == 0) {
                    System.out.println("Esse é um número par");

                } else {
                    System.out.println(("Esse é um número ímpar"));
                }
            } else {
                System.out.println("Digite um numero inteiro");
                teclado.next();
            }
        }
    }
}
