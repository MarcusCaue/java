/** 
 * Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
 * 
 * Resolução do professor: https://youtu.be/mqcNw_dhl8I
 * 
 * @data: 31/12/2021
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		//Como teremos que calcular a raíz quadrada, então eu vou trabalhar com números do tipo Double neste programa
		System.out.print("Digite um número: ");
		double num = entrada.nextDouble();

		System.out.printf("\nO dobro de %.0f vale %.0f.\n", num, (num * 2));
		System.out.printf("O triplo de %.0f vale %.0f.\n", num, (num * 3));
		System.out.printf("A raíz quadrada de %.0f vale %.2f.\n", num, Math.sqrt(num));

	}
}