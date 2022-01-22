/**
 * Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo e todas as informações possíveis sobre ele.
 * 
 * Como o professor resolvou esse exercício em Python, esta linguagem fornece alguns métodos que retornam true ou false para algumas características sobre uma varíavel (porque toda variável em Python é um objeto).
 * Métodos como:
 * 	isnumeric() -> verifica se a variável é um número.
 * 	istitle() -> verifica se a variável (se for uma string) está em formato de título 
 *	isdecimal() -> verifica se a variável é um número real.
 * 	etc...
 * 
 * Aqui em Java, eu criei uma classe chamada Variavel e os métodos necessários para resolver o exercício.
 * 
 * Resolução do professor: https://youtu.be/tHYxjJxtJko
 * 
 * @data: 31/12/2021
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite alguma coisa: ");
		String valor = entrada.nextLine();

		entrada.close();

		Variavel v1 = new Variavel(valor);

		System.out.println("\nTipo primitivo: " + v1.tipo());
		System.out.println("É somente espaços: " + v1.isSpace());
		System.out.println("É número: " + v1.isNumeric());
		System.out.println("É alfabético: " + v1.isAlpha());
		System.out.println("É alfanumérico: " + v1.isAlphaNum());
		System.out.println("Tudo em maísculo: " + v1.tudoMaiusculo());
		System.out.println("Tudo em minúsculo: " + v1.tudoMinusculo());
		System.out.println("É título: " + v1.isTitle());

	}
}
