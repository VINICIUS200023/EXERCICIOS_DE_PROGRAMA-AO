package Vetor;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5 */

public class Exc_13 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME O NÚMERO DA POSIÇÃO DO VETOR " + i);
            vetorA[i] = le.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {

                soma += vetorA[i];

            }
            System.out.print("VETOR A: ");

        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println("resultado: " + soma);
    }

}
