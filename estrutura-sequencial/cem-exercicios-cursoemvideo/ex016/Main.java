/**
 * Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.
 * 
 * Resolução feita pelo professor: https://youtu.be/-iSbDpl5Jhw
 * 
 * @data: 07/01/2022
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número real qualquer: ");
		double number = entrada.nextDouble();

		System.out.printf("O valor informado foi o número %.5f e a sua porção inteira é %d\n", number, (Math.round(number)));

		entrada.close();
	}
}