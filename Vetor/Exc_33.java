/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e a relação de todos os pares de 0 
até o respectivo elemento */

package Vetor;

import java.util.Scanner;

public class Exc_33 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Informe o numero da posição " + i);
            vetorA[i] = le.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            for (int j = 2; j < vetorA[i]; j++) {

                System.out.println(vetorA[i] + " é par");
                if (j % 2 == 0) {

                    System.out.println(j);

                }
            }
            System.out.println();
        }

    }
}
