package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		//- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		int[][] numero = new int[3][3];
		int cont=0, l=0, c=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os números: ");
		
		for(l=0; l<3; l++) {
			for( c=0; c<3; c++) {
				numero[l][c] = ler.nextInt();
			}
		}
		System.out.println("Os números maiores que 10 são: ");
		
		for(l=0; l<3; l++) {
			for( c=0; c<3; c++) {
				if(numero[l][c]>=10) {
					cont++;
					System.out.println(numero[l][c]);
				}
			}
		}
		System.out.println("A quantidade de números maiores que 10 é de " + cont);
	}

}
