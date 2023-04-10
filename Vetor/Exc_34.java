/* 5.Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e a relação de todos os divisores do 
respectivo elemento.*/
package Vetor;

import java.util.Scanner;

public class Exc_34 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Informe o numero da posição " + i);
            vetorA[i] = le.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println(" divisor  " + vetorA[i]);

            for (int j = 1; j < vetorA[i]; j++) {

                if (vetorA[i] % j == 0) {

                    System.out.println(j + "  divisor");

                }
            }
            System.out.println();
        }
    }
}