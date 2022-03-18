package br.dio.desafios;

import java.util.Scanner;

public class DesafioSeis {
	public static void main(String[] args) {

		// complete os espaços em branco com sua solução para o problema

		try (Scanner scan = new Scanner(System.in)) {
			int inicio, fim, horas = 0;

			inicio = scan.nextInt();
			fim = scan.nextInt();
			horas = 24 - (24 + inicio - fim) % 24;

			if (inicio == fim) {

				System.out.printf("O JOGO DUROU 24 HORA(S)\n");

			} else {

				System.out.printf("O JOGO DUROU " + horas + " HORA(S)\n");

			}
		}
	}
}
