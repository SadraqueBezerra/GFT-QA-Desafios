package br.dio.desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		int minutos;
		try (Scanner input = new Scanner(System.in)) {
			minutos = input.nextInt();
		}
		int K = (minutos * 2);
		System.out.printf("%d minutos\n", K); // Digite aqui o calculo dos minutos
	}
}
