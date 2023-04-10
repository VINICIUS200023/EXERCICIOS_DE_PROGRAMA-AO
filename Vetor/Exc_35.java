/*.Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que 
cada elemento do vetor A é formado pela potência de base 2 elevado 
ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2i
. Sugestão int A[11] */

package Vetor;

import java.util.Scanner;

public class Exc_35 {
    public static void main(String[] args) {

        double[] vetor = new double[11];

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = Math.pow(2, i);
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println();
    }
}
