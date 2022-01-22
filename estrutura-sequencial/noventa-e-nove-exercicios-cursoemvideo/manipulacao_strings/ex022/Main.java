/** 
 * Crie um programa que leia o nome completo de uma pessoa e mostre: 
 * - O nome com todas as letras maiúsculas e minúsculas.
 * - Quantas letras ao todo (sem considerar espaços).
 * - Quantas letras tem o primeiro nome.
 * 
 * Resolução feita pelo professor: https://youtu.be/EQQt-6QqXOs
 * 
 * @data: 21/01/20221
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

		System.out.print("Digite o seu nome completo: ");
		String nome = entrada.nextLine().strip();

		int tamanhoNome = nome.length() - countChar(' ', nome);
		String primeiroNome = nome.substring(0, nome.indexOf(" "));

		System.out.println("O seu nome tem " + tamanhoNome + " letras ao todo");
		System.out.println("O seu primeiro nome " + primeiroNome + " tem " + primeiroNome.length() + " letras");
		System.out.println("Nome com todas as letras maiúsculas: " + nome.toUpperCase());
		System.out.println("Nome com todas as letras minúsculas: " + nome.toLowerCase());

	}
}