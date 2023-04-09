/*Criar um vetor A com 5 elementos inteiros. Escreva um programa que 
imprima a tabuada de cada um dos elementos do vetor A. */
package Vetor;

import java.util.Scanner;

public class Exc_31 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o numero da posição " + i);
            vetor[i] = le.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("tabuada de " + vetor[i]);

            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + vetor[i] + " = " + (vetor[i] * j));
            }
        
            System.out.println();
            
        }
    }
}

