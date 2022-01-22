/**
 * Faça um programa que leia uma frase pelo teclado e mostre quantas vezes aparece a letra "A", em que posição ela aparece a primeira vez e em que posição ela aparece a última vez.
 * 
 * Resolução feita pelo professor: https://youtu.be/23UOVEetNPY
 * 
 * @data: 22/01/2022
 * 
*/

import java.util.Scanner;

public class Main {
	public static int countChar(char caracter, String palavra) {
		int ocorrencias = 0;
		char[] letras = palavra.toCharArray();

		for (char letra : letras) {
			if (caracter == letra) {
				ocorrencias++;
			}
		}

		return ocorrencias;
	}

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		String frase = entrada.nextLine().strip().toLowerCase();

		System.out.println("A letra 'A' aparece " + countChar('a', frase) + " vezes na sua frase");
		System.out.println("A letra 'A' aparece pela primeira vez na posição " + (frase.indexOf('a') + 1));
		System.out.println("A letra 'A' aparece pela última vez na posição " + (frase.lastIndexOf('a') + 1));

	}
}