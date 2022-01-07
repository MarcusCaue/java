/**
 * Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
 * 
 * Resolução feita pelo professor: https://youtu.be/4MAmKOT9FeU
 *
 * @data 05/01/2022  
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		double precoOriginal, precoDesconto;

		System.out.print("Digite o preço do produto: R$");
		precoOriginal = entrada.nextDouble();
		precoDesconto = precoOriginal - ((5 * precoOriginal) / 100);

		System.out.printf("O produto que custava R$%.2f, com 5%% de desconto passa a valer R$%.2f\n", precoOriginal, precoDesconto);

		entrada.close();
	}
}