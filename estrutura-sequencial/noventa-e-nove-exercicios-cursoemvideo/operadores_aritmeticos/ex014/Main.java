/**
 * Escreva um programa que converta uma temperatura digitando em graus Celsius para graus Fahrenheit.
 *  
 * Resolução feita pelo professor: https://youtu.be/9l_Gay8BuAw
 * 
 * @data: 06/01/2022
 * 
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		float celsius, fahrenheit;

		System.out.print("Digite uma temperatura em °C: ");
		celsius = entrada.nextFloat();

		fahrenheit = (9 * celsius / 5) + 32;

		System.out.printf("%.1f°C corresponde a %.1f°F\n", celsius, fahrenheit);

		entrada.close();
	}
}