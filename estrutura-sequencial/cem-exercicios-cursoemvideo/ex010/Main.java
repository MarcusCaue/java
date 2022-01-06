/**
 * Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.
 *  
 * Resolução feita pelo professor: https://youtu.be/xM4AX3Lp2mo
 * 
 * @data: 05/01/2022
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quanto de dinheiro você tem na carteira? R$");
		double money = entrada.nextDouble();

		double dolars = money / 5.71;

		System.out.printf("Com R$%.2f é possível comprar US$%.2f\n", money, dolars);

		entrada.close();
	}
}