package br.dio.desafios;

import java.util.Scanner;

public class DesafioDoze {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int C = sc.nextInt();
		
		if (L % 2 == C % 2)
			System.out.println(" 1 ");
		else                                               //complete o c�digo nos espa�os em branco
			System.out.println(" 0 ");
		sc.close();
	}
}