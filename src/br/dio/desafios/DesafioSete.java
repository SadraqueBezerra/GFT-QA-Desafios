package br.dio.desafios;

import java.util.Scanner;

public class DesafioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        //TODO: Complete os espa�os em branco com as respectivas vari�veis para o c�lculo da m�dia.
        media = (A * 3.5 + B * 7.5)/11; 

        //TODO: Complete com a vari�vel que representa o resultado da m�dia.
        System.out.printf("MEDIA = %.5f",  media);
        System.out.println();
    }
}
