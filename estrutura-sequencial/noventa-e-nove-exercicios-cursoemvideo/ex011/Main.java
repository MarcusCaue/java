/**
 *  Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 *  
 * Resolução feita pelo professor: https://youtu.be/mzSJpn9ldt4
 * 
 * @data: 05/01/2022
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		double largura, altura, area, litrosTinta;

		System.out.print("Largura da parede em metros: ");
		largura = entrada.nextDouble();

		System.out.print("Altura da parede em metros: ");
		altura = entrada.nextDouble();

		area = largura * altura;
		litrosTinta = area / 2;

		System.out.printf("Sua parede possui dimensões %.2fmx%.2fm e sua área é de %.2fm².\nPara pintar essa parede, serão necessários %.2fL de tinta.\n", largura, altura, area, litrosTinta);

		entrada.close();
	}
}