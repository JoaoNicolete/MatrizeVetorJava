package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		 *� Os n�meros pares digitados;  
		*� A soma dos n�meros pares digitados; 
		*� Os n�meros �mpares digitados; 
		*� A quantidade de n�meros �mpares digitados.*/
		
		int[] numero = new int[6];
		int soma=0, cont=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int l=0; l<=5; l++) {
			System.out.println("Digite os n�meros: ");
			numero[l] = ler.nextInt();
		}
		
		System.out.println("Os n�meros pares s�o: ");
		
		for(int l=0; l<=5; l++) {
			if(numero[l]%2 ==0) {
				soma = soma + numero[l];
				System.out.println(numero[l]);
			} 
		}
		
		System.out.println("Os n�meros impares s�o: ");
		
		for(int l=0; l<=5; l++) {
			if(numero[l]%2 !=0) {
				cont++;
				System.out.println(numero[l]);
			} 
		}
		
		System.out.println("A soma dos n�meros pares �: " + soma);
		System.out.println("A quantidade de n�meros �mpares digitados foi de: " + cont);
		
		ler.close();


	}

}
