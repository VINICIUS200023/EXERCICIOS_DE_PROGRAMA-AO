/*Ler um vetor A com 10 elementos inteiros correspondentes as idades 
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35 
anos */

package Vetor;

import java.util.Scanner;

public class Exc_17 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe a idade da pessoa " + i);
            vetorA[i] = le.nextInt();
        }
        int idade = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {
                idade++;
            }
        }
        System.out.println("Pessoas com mais de 35 anos: " + idade);
    }

}
