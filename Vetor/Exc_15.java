package Vetor;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor. */

public class Exc_15 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe a posição do vetor " + i);
            vetorA[i] = le.nextInt();
        }
        int soma = 0;
        double par = 0;
        double impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                soma += vetorA[i];
                par++;
            } else {
                soma += vetorA[i];
                impar++;

            }

        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i]);
        }
        System.out.println("\nPar: " + par);
        System.out.println("Impares: " + impar);
        System.out.println("Percetual de par: " + (par * 100) / vetorA.length);
        System.out.println("Percentual de impares: " + (impar * 100) / vetorA.length);

    }
}
