package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*- Faça um programa que receba 6 números inteiros e mostre: 
		 *• Os números pares digitados;  
		*• A soma dos números pares digitados; 
		*• Os números ímpares digitados; 
		*• A quantidade de números ímpares digitados.*/
		
		int[] numero = new int[6];
		int soma=0, cont=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int l=0; l<=5; l++) {
			System.out.println("Digite os números: ");
			numero[l] = ler.nextInt();
		}
		
		System.out.println("Os números pares são: ");
		
		for(int l=0; l<=5; l++) {
			if(numero[l]%2 ==0) {
				soma = soma + numero[l];
				System.out.println(numero[l]);
			} 
		}
		
		System.out.println("Os números impares são: ");
		
		for(int l=0; l<=5; l++) {
			if(numero[l]%2 !=0) {
				cont++;
				System.out.println(numero[l]);
			} 
		}
		
		System.out.println("A soma dos números pares é: " + soma);
		System.out.println("A quantidade de números ímpares digitados foi de: " + cont);
		
		ler.close();


	}

}
