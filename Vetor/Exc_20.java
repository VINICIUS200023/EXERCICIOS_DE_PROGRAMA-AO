/*Implementar um programa que obtenha a cotação do dólar (U$) em 
relação ao real (R$) e a seguir armazene em vetor A com 20 
elementos as seguintes conversões */

package Vetor;

import java.util.Scanner;

public class Exc_20 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        double[] vetorA = new double[20];
        double dolar = 5.08;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME O VALOR DO VETOR " + (i + 1));
            vetorA[i] = le.nextDouble();
        }
    }
}
