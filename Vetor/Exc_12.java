/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.  */
package Vetor;

import java.util.Scanner;

public class Exc_12 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME O NUMERO DO VETOR " + i);
            vetorA[i] = le.nextInt();

        }
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];
        }
        System.out.print("VETOR A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println("SOMA DOS VETORES " + soma);
    }
}
