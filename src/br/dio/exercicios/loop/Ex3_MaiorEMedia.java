/* Fa�a um programa que leia 5 n�meros e informe o maior n�mero e a m�dia desses n�meros.*/

package br.dio.exercicios.loop;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		int media = 0;
		
		int count = 0;
		
		do {
			
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if (numero > maior) maior = numero;
			
			count++;
			media++;
		
		} while(count < 5);
		
		System.out.println("\nMaior: " + maior);
		System.out.println("M�dia: " + soma/media);
	}
}
