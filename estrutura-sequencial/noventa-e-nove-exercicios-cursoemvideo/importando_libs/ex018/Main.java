/**
 * Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
 * 
 * Resolução feita pelo professor: https://youtu.be/9GvsphwW26k
 * 
 * @data: 07/01/2022
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um ângulo qualquer em graus: ");
		double ang = entrada.nextDouble();

		//Convertendo o ângulo lido em graus para radianos (porque os métodos abaixo recebem como parâmetro um número em radianos)
		ang = Math.toRadians(ang);

		double sin = Math.sin(ang), cos = Math.cos(ang), tan = Math.tan(ang);

		System.out.printf("Valor do SENO desse ângulo: %.2f\n", sin);
		System.out.printf("Valor do COSSENO desse ângulo: %.2f\n", cos);
		System.out.printf("Valor da TANGENTE desse ângulo: %.2f\n", tan);
		
		entrada.close();
	}
}