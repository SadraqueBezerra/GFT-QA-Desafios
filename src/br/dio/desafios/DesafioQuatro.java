package br.dio.desafios;

import java.util.Scanner;

public class DesafioQuatro {

	public static void main(String[] args) throws Exception {
		try (Scanner scan = new Scanner(System.in)) {
			int count = scan.nextInt();
			String A, B;

			for (int i = 0; i < count; i++) {

				A = scan.next();
				B = scan.next();

				if (A.endsWith(B))

					System.out.println("encaixa");

				else

					System.out.println("nao encaixa");

			}
		}

	}
}
