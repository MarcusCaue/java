/**
 *  Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento
 *  
 * Resolução feita pelo professor: https://youtu.be/cTkivN8XcJ0
 * 
 * @data: 06/01/2022
 * 
*/

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		double salario, salAumento;

		System.out.print("Digite o valor do seu salário: R$");
		salario = entrada.nextDouble();

		salAumento = salario + (salario * 0.15);

		System.out.printf("O seu salário com 15%% de aumento passa a valer R$%,.2f\n", salAumento);

		entrada.close();
		
	}
}