/**
 * Um professor quer sortear um dos seus quatro alunos para apagar o quadro. Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
 * 
 * Vou criar duas resoluções: 
 * 	1 - Uma usando vetores e estruturas de repetição;
 * 	2 - Com variáveis simples e estruturas condicionais. 
 * 
 * Resolução feita pelo professor: https://youtu.be/_Nk02-mfB5I
 * 
 * @data: 07/01/2022
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();

		//Primeira resolução
		String nomes[] = new String[4];
		
		for (byte i = 0; i < 4; i++) {
			System.out.printf("Digite o nome do %d° aluno: ", i + 1);
			nomes[i] = entrada.nextLine();
		}

		int numEscolhido = gerador.nextInt(3);

		System.out.println("O aluno escolhido foi o aluno: " + nomes[numEscolhido]);

		//Segunda resolução
		/*String a1, a2, a3, a4;

		System.out.print("Digite o nome do primeiro aluno: ");
		a1 = entrada.nextLine();
		System.out.print("Digite o nome do segundo aluno: ");
		a2 = entrada.nextLine();
		System.out.print("Digite o nome do terceiro aluno: ");
		a3 = entrada.nextLine();
		System.out.print("Digite o nome do quarto aluno: ");
		a4 = entrada.nextLine();

		int numEscolhido = gerador.nextInt(3);

		if (numEscolhido == 0) {
			System.out.println("O aluno escolhido foi o aluno: " + a1);
		} else if (numEscolhido == 1) {
			System.out.println("O aluno escolhido foi o aluno: " + a2);
		} else if (numEscolhido == 2) {
			System.out.println("O aluno escolhido foi o aluno: " + a3);
		} else {
			System.out.println("O aluno escolhido foi o aluno: " + a4);
		}*/

		entrada.close();			
	}
}