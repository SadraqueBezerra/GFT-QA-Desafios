/*Fa�a um programa que pe�a N n�meros inteiros. Calcule e mostre a quantidade de n�meros 
 * pares e a quantidade de n�meros impares.
 */

package br.dio.exercicios.loop;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int quantNumeros;
			int numero;
			int contadorNumeros = 1;
			int quantPares = 0, quantImpares = 0;
			
			System.out.println("Quantidade de N�meros: ");
			quantNumeros = scan.nextInt();
			
			
			int count = 0;
			do {
				System.out.println("N�mero " + contadorNumeros + " = ");
				numero = scan.nextInt();
				
				if (numero % 2 == 0) quantPares++;
				else quantImpares++;
				
				count++;
				contadorNumeros++;
				
			} while(count < quantNumeros);
			
			System.out.println("\nQuantidade de Pares: " + quantPares);
			System.out.println("Quantidade de Impares: " + quantImpares);
		}
	}
}
