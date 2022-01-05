/**
 * Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.
 * 
 * Resolução feita pelo professor: https://youtu.be/_QfISzy0IKs
 * 
 * @data: 04/01/2022 
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		double n1, n2, media;

		System.out.print("Digite a primeira nota do aluno: ");
		n1 = entrada.nextDouble();

		System.out.print("Digite a segunda nota do aluno: ");
		n2 = entrada.nextDouble();

		media = (n1 + n2) / 2;

		System.out.printf("A média entre %.1f e %.1f é igual a %.1f\n", n1, n2, media);

		entrada.close();
	}
}