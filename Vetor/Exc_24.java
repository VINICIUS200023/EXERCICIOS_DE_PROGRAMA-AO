/*.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 
quando Ai for ímpar */

package Vetor;

import java.util.Scanner;

public class Exc_24 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        System.out.println("Vetor ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o numero da posição " + i);
            vetorA[i] = le.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }
        System.out.println("VETOR A ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("VETOR B ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] + " ");
        }

    }
}
