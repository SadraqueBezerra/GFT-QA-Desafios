package br.dio.desafios;

import java.util.Scanner;

public class DesafioDez {
//complete os espa�os em branco com sua solu��o
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
