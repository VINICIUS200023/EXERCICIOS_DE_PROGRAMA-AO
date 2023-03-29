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
        int menorIdade = vetor[0];
        int idxMenor = 0;
        int maiorIdade = vetor[0];
        int idxMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorIdade) {
                maiorIdade = vetor[i];
                idxMaior = i;
            } else if (vetor[i] < menorIdade) {
                menorIdade = vetor[i];
                idxMenor = i;
            }
        }
        System.out.println("VETOR DE IDADE ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Indice de menor Idade " + idxMenor);
        System.out.println("Maior Idade " + maiorIdade);
        System.out.println("Indice de Maior Idade: " + idxMaior);
    }

}
