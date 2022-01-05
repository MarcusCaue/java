/**
 * Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.
 * 
 * Obs.: Por enquanto a resolução deste exercício não será feita utilizando estruturas de repetição.
 * 
 * Resolução feita pelo professor: https://youtu.be/qajq3SI0QQs
 * 
 * @data: 04/01/2022
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número para ver a sua tabuada: ");
		int number = entrada.nextInt();

		System.out.printf("%d x %2d = %d\n", number, 1, (number * 1));
		System.out.printf("%d x %2d = %d\n", number, 2, (number * 2));
		System.out.printf("%d x %2d = %d\n", number, 3, (number * 3));
		System.out.printf("%d x %2d = %d\n", number, 4, (number * 4));
		System.out.printf("%d x %2d = %d\n", number, 5, (number * 5));
		System.out.printf("%d x %2d = %d\n", number, 6, (number * 6));
		System.out.printf("%d x %2d = %d\n", number, 7, (number * 7));
		System.out.printf("%d x %2d = %d\n", number, 8, (number * 8));
		System.out.printf("%d x %2d = %d\n", number, 9, (number * 9));
		System.out.printf("%d x %2d = %d\n", number, 10, (number * 10));

		entrada.close();
		
	}
}