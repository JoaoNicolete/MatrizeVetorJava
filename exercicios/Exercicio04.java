package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
			*(1) somar as duas matrizes 
			*(2) subtrair a primeira matriz da segunda 
			*(3) adicionar uma constante as duas matrizes
			*(4) imprimir as matrizes 
			*Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
			*Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve 
			*ser armazenado na própria matriz.*/
		
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		int constante;
		char opcao;
		double[][] matriz3 = new double[2][2];
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a matriz 1: ");
		for(int l=0; l<2; l++) {
			for(int  c=0; c<2; c++) {
				matriz1[l][c] = ler.nextDouble();
			}
		}
		System.out.println("Insira a matriz 2: ");
		for(int l=0; l<2; l++) {
			for(int  c=0; c<2; c++) {
				matriz2[l][c] = ler.nextDouble();
			}
		}
		
		System.out.println("Digite o que deseja fazer: ");
		System.out.println("(1) somar as duas matrizes ");
		System.out.println("(2) subtrair a primeira matriz da segunda");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		opcao = ler.next().charAt(0);
		
		switch(opcao) {
			case '1':
				System.out.println("Soma da matriz 1 e 2:");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						matriz3[l][c] = (matriz1[l][c] + matriz2[l][c]);
						System.out.print(matriz3[l][c] + " | ");
					}
					System.out.println();
				}
				break;
				
			case '2':
				System.out.println("Subtração da matriz 1 e 2:");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						matriz3[l][c] = (matriz1[l][c] - matriz2[l][c]);
						System.out.print(matriz3[l][c] + " | ");
					}
					System.out.println();
				}
				break;
				
			case '3': 
				System.out.println("Insira a constante");
				constante = ler.nextInt();
				
				System.out.println("Soma da constante e matriz 1:");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						matriz1[l][c] = (matriz1[l][c] + constante);
						System.out.print(matriz1[l][c] + " | ");
					}
					System.out.println();
				}
				System.out.println("Soma da constante e matriz 2:");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						matriz2[l][c] = (matriz2[l][c] + constante);
						System.out.print(matriz2[l][c] + " | ");
					}
					System.out.println();
				}
				break;
				
			case '4': 
				System.out.println("Matriz 1:");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						System.out.print(matriz1[l][c] + " | ");
					}
					System.out.println();
				}
				System.out.println("Matriz 2:");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						System.out.print(matriz2[l][c] + " | ");
					}
					System.out.println();
				}
				break;
			default: 
				System.out.println("Opção não reconhecida");
				break;
				
		}
		
		ler.close();

	}

}
