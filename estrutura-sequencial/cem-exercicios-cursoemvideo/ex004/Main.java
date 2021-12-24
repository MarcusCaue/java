/**
 * Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo e todas as informações possíveis sobre ele.
 * 
 * Como o professor resolvou esse exercício em Python, esta linguagem fornece alguns métodos que retornam true ou false para algumas características sobre uma varíavel (porque toda variável em Python é um objeto).
 * Métodos como:
 * 	isnumeric() -> verifica se a variável é um número.
 * 	istitle() -> verifica se a variável (se for uma string) está em formato de título 
 *	isdecimal() -> verifica se a variável é um número real.
 * 	etc...
 * 
 * Aqui em Java, eu criei uma classe chamada Variavel e os métodos necessários para resolver o exercício.
 * 
 * Resolução do professor: https://youtu.be/tHYxjJxtJko
 * 
 * @data: 24/12/2021
*/

public class Main {
	public static void main(String args[]) {
		String valor = "12";

		Variavel v1 = new Variavel(valor);

		v1.tipo();

	}
}
