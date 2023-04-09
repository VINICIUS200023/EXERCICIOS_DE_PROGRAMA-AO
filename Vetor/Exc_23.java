package Vetor;

import java.util.Scanner;

public class Exc_23 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o numero para posição " + i);
            vetorA[i] = le.nextInt();
        }
        boolean palidromo = true;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palidromo = false;
                break;
            }

        }
        System.out.println("Vetor A = ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        if (palidromo) {
            System.out.println("PALIDROMO");
        } else {
            System.out.println("Não é Palidromo");
        }
    }
}