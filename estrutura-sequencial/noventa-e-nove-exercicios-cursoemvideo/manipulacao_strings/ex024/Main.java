/**
 * Crie um programa que leia o nome de uma cidade diga se ela começa ou não com o nome "SANTO". 
 * 
 * Resolução feita pelo professor: https://youtu.be/QroT8cZMRnc
 * 
 * @data: 22/01/2022
 * 
*/
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome da sua cidade: ");
		String cidade = entrada.nextLine().strip().toLowerCase();
		String firstName = cidade.substring(0, cidade.indexOf(" "));

		if (firstName.equals("santo")) {
			System.out.println("A sua cidade começa com a palavra 'Santo' :)");
		} else {
			System.out.println("A sua cidade NÃO começa com a palavra 'Santo'");
		}

		entrada.close();
	}
}