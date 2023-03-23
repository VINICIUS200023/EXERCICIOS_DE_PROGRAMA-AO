package Vetor;

import java.util.Scanner;

public class Exc_05 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME A POSIÇÃO DO VETOR " + i);
            vetorA[i] = le.nextInt();

            vetorB[i] = vetorA[i] * i;

        }
        System.out.print("VETOR A: ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i]);
        }
        System.out.println();

        System.out.print("VETOR B: ");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i]);
        }
    }
}