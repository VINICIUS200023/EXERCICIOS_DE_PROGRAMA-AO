/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor */

import java.util.Scanner;

public class Exc_14 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe a posição do vetor " + i);
            vetorA[i] = le.nextInt();
        }
        int soma = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                impar++;
            }
        }
        System.out.println("vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println("soma: " + soma);
        System.out.println("media: " + soma / impar);
    }
}
