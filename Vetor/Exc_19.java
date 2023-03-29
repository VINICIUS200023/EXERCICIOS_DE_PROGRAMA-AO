/*Ler as duas notas bimestrais para um conjunto de 10 alunos. 
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do 
tipo real. Escreva um programa que calcule a média aritmética simples 
das notas informadas armazenando o resultado em um vetor “Result” 
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação 
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno 
estará “aprovado”, caso contrário, a situação do aluno será 
“reprovado” */
package Vetor;

import java.util.Scanner;

public class Exc_19 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultado = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Informe a nota 1 do aluno " + (i + 1));
            notas1[i] = le.nextInt();

            System.out.println("Informe a nota 2 do aluno " + (i + 1));
            notas2[i] = le.nextInt();

            resultado[i] = (notas1[i] + notas2[i]) / 2;
        }

        System.out.println();
        System.out.println("NOTAS 1 ");

        for (int i = 0; i < notas1.length; i++) {
            System.out.print(notas1[i] + " ");
        }
        System.out.println();

        System.out.println("Notas 2 ");

        for (int i = 0; i < notas2.length; i++) {
            System.out.print(notas2[i] + " ");
        }
        System.out.println();

        System.out.println("Resultado: ");
        for (int i = 0; i < resultado.length; i++) {

            if (resultado[i] >= 7) {
                System.out.println("Aprovado com media: " + resultado[i]);
            } else {
                System.out.println("Reprovado com a media: " + resultado[i]);
            }
        }

    }

}
