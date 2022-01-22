/** 
 * Faça um programa que leia um número de 0 a 9999 e mostre na tela cada um dos dígitos separados.
 * 
 * Resolução feita pelo professor: https://youtu.be/wD2aerLMBWA
 * 
 * @data: 22/01/2022
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número entre 0 e 9999: ");
		String num = entrada.nextLine().strip();

		while (num.length() > 4) {
			System.out.print("Valor inválido. Digite apenas um número entre 0 e 9999: ");
			num = entrada.nextLine().strip();
		}

		entrada.close();

		while (num.length() < 4) {
			num = "0" + num;
		}

		char unidade = num.charAt(3), 
		dezena = num.charAt(2), 
		centena = num.charAt(1), 
		milhar = num.charAt(0);
		
		System.out.println("Unidade: " + unidade);
		System.out.println("Dezena: " + dezena);
		System.out.println("Centena: " + centena);
		System.out.println("Milhar: " + milhar);
		
	}
}