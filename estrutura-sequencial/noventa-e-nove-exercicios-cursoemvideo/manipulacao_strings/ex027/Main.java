/**
 * Faça um programa que leia o nome completo de uma pessoa, mostrando em seguida o primeiro e o último nome separadamente.
 * 
 * Resolução feita pelo professor: https://youtu.be/SifYYsXhLM8
 * 
 * @data: 22/01/2022
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome completo: ");
		String nome = entrada.nextLine().strip();
		
		String[] partesNome = nome.split(" ");

		System.out.println("O seu primeiro nome é: " + partesNome[0]);
		System.out.println("O seu último nome é: " + partesNome[partesNome.length - 1]);
	}
}