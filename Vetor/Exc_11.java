/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares. */
package Vetor;

import java.util.Scanner;

public class Exc_11 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME A POSIÇÃO DO VETOR " + i);
            vetorA[i] = le.nextInt();

        }
        int qtdPares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }

        }
        System.out.println("VETOR A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("QUANTIDADE DE NÚMEROS PARES: " + qtdPares);

    }

}
