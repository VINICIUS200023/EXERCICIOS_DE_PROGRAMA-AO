/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e uma mensagem indicando se o 
respectivo elemento é um número primo ou não. */

package Vetor;

import java.util.Scanner;

public class Exc_32 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o numero da posição " + i);
            vetor[i] = le.nextInt();
        }

        boolean primo;
        String msg;

        for (int i = 0; i < vetor.length; i++) {

            primo = true;
            for (int j = 2; j < vetor[i]; j++) {

                if (vetor[i] % j == 0) {
                    primo = false;
                    break;
                }

            }
            msg = "";
            if (primo) {
                msg = " primo";
            } else {
                msg = " não é primo";
            }
            System.out.println(vetor[i] + msg);
        }

    }

}
