/*Implementar um programa que obtenha a cotação do dólar (U$) em 
relação ao real (R$) e a seguir armazene em vetor A com 20 
elementos as seguintes conversões */

package Vetor;

import java.util.Scanner;

public class Exc_20 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        double[] vetorA = new double[20];
        double dolar;
        System.out.println("INFORME O VALOR DO DOLAR ");
        dolar = le.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = dolar * (i + 1);
        }
        System.out.println("VETOR DE IDADE ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
    }
}
