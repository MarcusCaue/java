/**
 * Faça um programa que leia um número inteiro e mostre na tela o seu sucesso e seu antecessor. 
 * 
 * Resolução do professor: https://youtu.be/664e0G_S9nU
 * 
 * @data: 31/12/2021
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = entrada.nextInt();

		entrada.close();

		System.out.printf("Analisando o número %d, o seu sucessor é o número %d e o seu antecessor é o número %d\n", num, (num + 1), (num - 1));

	}
}