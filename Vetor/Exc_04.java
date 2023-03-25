package Vetor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc_04 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME A POSIÇÃO DO VETOR " + i);
            vetorA[i] = le.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println("VETOR A: ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("VETOR B: ");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }
    }
}
