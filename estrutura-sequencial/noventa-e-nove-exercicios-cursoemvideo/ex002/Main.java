/**
 * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.
 * 
 * Resolução do professor: https://youtu.be/FNqdV5Zb_5Q
 * 
 * @data: 24/12/2021
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Saudações " + nome + ", seja bem-vind@! É uma honra conhecê-l@!");

		entrada.close();
	}
}