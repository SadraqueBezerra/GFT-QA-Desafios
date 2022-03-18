/* Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem 
 * inversa.
 */

package br.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
	public static void main(String[] args) {
		
		System.out.println("Vetor: ");
		int[] vetor = {0, 5, -10, 50, 6, -50};
		int count = 0;
		
		while(count <= (vetor.length-1)) {
			
			System.out.print(vetor[count] + " ");
			count++;
			
		}
		
		System.out.println("\nVetor: ");
		for(int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
			
		}
	}
}
