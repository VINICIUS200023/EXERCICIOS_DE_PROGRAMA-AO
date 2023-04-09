/*6.Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes 
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi; 
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 
quando Ai for menor que Bi */

package Vetor;

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Exc_25 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o numero da posição " + i);
            vetorA[i] = le.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {

            System.out.println("Informe o numero da posição " + i);
            vetorB[i] = le.nextInt();

            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;

            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
        }
        System.out.println("VETOR A ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.println();
        System.out.println("VETOR B ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        System.out.println("VETOR C ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }
}
