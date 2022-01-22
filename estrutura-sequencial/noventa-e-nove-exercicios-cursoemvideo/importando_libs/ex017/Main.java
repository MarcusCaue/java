/**
 * Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo. Calcule e mostre o comprimento da hipotenusa.
 * 
 * Resolução feita pelo professor: https://youtu.be/vmPW9iWsYkY
 * 
 * @data: 07/01/2022
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		double catOP, catAD, hip;

		System.out.print("Informe a medida do cateto oposto em metros: ");
		catOP = entrada.nextDouble();

		System.out.print("Agora informe a medida do cateto adjacente: ");
		catAD = entrada.nextDouble();

		hip = Math.hypot(catOP, catAD);

		System.out.printf("A hipotenusa mede %.2fm\n", hip);

		entrada.close();
	}
}