/**
 * Crie um programa que leia dois números e mostre a soma entre eles.
 * 
 * Resolução do professor: https://youtu.be/PB254Cfjlyk
 * 
 * @data: 24/12/2021
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = entrada.nextInt();

		System.out.print("Digite outro número: ");
		int n2 = entrada.nextInt();

		int soma = n1 + n2;

		System.out.printf("A soma entre %d e %d é igual a %d\n", n1, n2, soma);

		entrada.close();

	}
}