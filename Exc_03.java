package Vetor;

import java.util.Scanner;

public class Exc_03 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("INFORME A POSIÇÃO DO VETOR A " + i);
            vetorA[i] = le.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.println("VETOR A ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i]);
        }
        System.out.println();

        System.out.println("VETOR B ");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i]);
        }
    }
}
