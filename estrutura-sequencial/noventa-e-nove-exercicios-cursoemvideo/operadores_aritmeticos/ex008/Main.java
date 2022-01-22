/**
 * Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
 * 
 * Obs.: Durante a resolução o professor sugere que façamos também a conversão do valor para km, hm, dam e dm. 
 * 
 * Resolução feita pelo professor: https://youtu.be/KjcdG05EAZc
 * 
 * @data: 04/01/2022 
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira uma distância em metros (m): ");
		float distance = entrada.nextFloat();

		System.out.printf("A medida de %.1fm corresponde aproximadamente a: \n", distance);
		System.out.printf("%.3fkm\n", (distance / 1000));
		System.out.printf("%.2fhm\n", (distance / 100));
		System.out.printf("%.1fdam\n", (distance / 10));
		System.out.printf("%.0fdm\n", (distance * 10));
		System.out.printf("%.0fcm\n", (distance * 100));
		System.out.printf("%.0fmm\n", (distance * 1000));

        entrada.close();
		
	}
}
