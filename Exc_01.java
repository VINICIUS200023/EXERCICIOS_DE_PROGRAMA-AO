package Vetor;

import java.util.Scanner;

public class Exc_01 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME O VALOR DA POSIÇÃO " + i);
            vetorA[i] = le.nextInt();

            vetorB[i] = vetorA[i];
        }
        System.out.print("VETOR A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + "");
        }
        System.out.println();

        System.out.print("VETOR B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + "");
        }
        System.out.println();
    }
}
