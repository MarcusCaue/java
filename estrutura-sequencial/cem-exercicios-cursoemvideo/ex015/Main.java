/**
 * Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.
 *  
 * Resolução feita pelo professor: https://youtu.be/I4NYUeetLAc
 * 
 * @data: 06/01/2022
 * 
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		double valorTotalAluguel, kmRodados, diasAlugados;

		System.out.print("Informe a quantidade de quilômetros rodados pelo carro: ");
		kmRodados = entrada.nextInt();

		System.out.print("Digite agora a quantidade de dias em que o carro esteve alugado: ");
		diasAlugados = entrada.nextInt();

		valorTotalAluguel = (diasAlugados * 60) + (kmRodados * 0.15);

		System.out.printf("Valor total a pagar: R$%,.2f\n", valorTotalAluguel);

		entrada.close();
		
	}
}