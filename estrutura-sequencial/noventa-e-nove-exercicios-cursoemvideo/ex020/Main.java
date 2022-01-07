/**
 * O mesmo professor do desafio 019 quer sortear a ordem de apresentação de trabalhos dos alunos. Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.
 * 
 * Resolução feita pelo professor: https://youtu.be/OPh0nngbBSY
 * 
 * @data: 07/01/2022
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

	public static boolean estaEm(String elemento, String[] lista) {
		for (String valor : lista) {
			if (elemento == valor) {
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();

		//Leitura dos dados
		String nomes[] = new String[4];
		
		for (byte i = 0; i < 4; i++) {
			System.out.printf("Digite o nome do %d° aluno: ", i + 1);
			nomes[i] = entrada.nextLine();
		}

		entrada.close();

		//Sorteando a ordem em que os elementos vão estar organizados
		String ordem[] = new String[4];
		byte tamReal = 0;

		while (tamReal < 4) {
			int posicaoEscolhida = gerador.nextInt(4);
			String nomeEscolhido = nomes[posicaoEscolhida];
			
			if (! estaEm(nomeEscolhido, ordem)) {
				ordem[tamReal] = nomeEscolhido;
				tamReal++;
			}	
		}

		System.out.println("A ordem de apresentação do trabalho será: ");
		System.out.println(Arrays.toString(ordem));
		
	}
}