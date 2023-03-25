/*Criar um vetor A com 10 elementos inteiros. Escrever um programa 
que calcule e escreva: a) a soma de elementos armazenados neste 
vetor que são inferiores a 15; b) a quantidade de elementos 
armazenados no vetor que são iguais a 15; e c) a média dos 
elementos armazenados no vetor que são superiores a 15. */

package Vetor;

import java.util.Scanner;

public class Exc_16 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("INNFORME A POSIÇÃO DO VETOR " + i);
            vetor[i] = le.nextInt();

        }
        int somaMenor15 = 0;
        int igualA15 = 0;
        int somaMaior15 = 0;
        int media = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 15) {
                somaMenor15 += vetor[i];
            } else if (vetor[i] == 15) {
                igualA15++;

            } else {
                media++;
                somaMaior15 += vetor[i];

            }
        }
        System.out.println("VETOR :");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.print("\nSOMA DE NUMEROS INFERIORES A 15: " + somaMenor15);
        System.out.print("\na QUANTIDADE DE NUMEROS IGUAIS A 15: " + igualA15);
        System.out.print("\nMEDIA DE NUMERIOS SUPERIORES A 15: " + somaMaior15 / media);

    }
}
