package Vetor;

import java.util.Scanner;

public class Exc_07 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME A POSIÇÃO DO VETOR A " + i);
            vetorA[i] = le.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("INFORME A POSIÇÃO VETOR B " + i);
            vetorB[i] = le.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.println();

        System.out.println("VETOR A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println();

        System.out.println("VETOR B: ");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }

        System.out.println();

        System.out.println("VETOR C: ");

        for(int i = 0; i < vetorC.length; i++){
            System.out.println(vetorC[i]);
        }
    }

}
