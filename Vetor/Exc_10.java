/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.*/
package Vetor;

import java.util.Scanner;

public class Exc_10 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME A POSIÇÃO DO VETOR A " + i);
            vetorA[i] = le.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }

        System.out.println("VETOR A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.println();

        System.out.println("VETOR B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] + " ");
        }
    }

}
