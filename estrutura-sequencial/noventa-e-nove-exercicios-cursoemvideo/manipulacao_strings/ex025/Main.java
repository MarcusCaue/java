/**
 * Crie um programa que leia o nome de uma pessoa e diga se ela tem "SILVA" no nome.
 * 
 * Resolução feita pelo professor: https://youtu.be/WHWGz2Dy1ZU
 * 
 * @data: 22/01/2022 
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome completo: ");
		String nome = entrada.nextLine().strip().toLowerCase();

		boolean resultado;
		if (nome.contains(" silva")) {
			resultado = true;
		} else {
			resultado = false;
		}

		System.out.println("O seu nome tem 'silva'? " + resultado);

		entrada.close();

	}
}