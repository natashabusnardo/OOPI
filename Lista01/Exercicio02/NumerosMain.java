package Exercicio02;

import java.util.Scanner;

public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Numeros n = new Numeros();

        System.out.println("Primeiro número: ");
        n.setUm(entrada.nextInt());
        System.out.println("Segundo número: ");
        n.setDois(entrada.nextInt());

        entrada.close();
        int[] vet = n.intervalo();
        //n.intervalo();
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
