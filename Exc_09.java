package Vetor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc_09 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("INFORME A POSIÇÃO DO VETOR A " + i);
            vetorA[i] = le.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("INFORME A POSIÇÃO DO VETOR B " + i);
            vetorB[i] = le.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
        }
        System.out.println();

        System.out.print("VETOR A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("VETOR B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();
        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("VETOR C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(df.format(vetorC[i]) + " ");
        }

    }
}
