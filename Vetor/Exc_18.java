/*Ler um vetor A com 10 elementos inteiros correspondentes as idades 
de um grupo de pessoas. Escreva um programa que determine e 
escreva a menor e a maior idades e suas respectivas posições. */
package Vetor;

import java.util.Scanner;

public class Exc_18 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe a idade da pessoa " + i);
            vetor[i] = le.nextInt();
        }
        int menorIdade = 0;
        for (int i = 0; i < vetor.length; i++) {
            
        }
    }

}
