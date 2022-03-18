/* Fa�a um Programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100) 
 * armazene-os num vetor. 
 * Ao final, mostre os n�meros e seus sucessores.
 */

package br.dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("N�meros Aleat�rios: ");
		for ( int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\n\nAntecessor dos N�meros Aleat�rios: ");
		for ( int numero : numerosAleatorios) {
			System.out.print((numero-1) + " ");
		}
		
		System.out.println("\n\nSucessores dos N�meros Aleat�rios: ");
		for ( int numero : numerosAleatorios) {
			System.out.print((numero+1) + " ");
		}
			
	}
}
