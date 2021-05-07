package aula;

import java.util.Scanner;

public class TreinoMatriz03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		
		System.out.println("==Calculando a média dos alunos==");
		
		for(int l=0; l<notasAlunos.length; l++) {
			for(int c=0; c<notasAlunos[l].length; c++) {
				System.out.printf("Digite as notas: %d %d: ", l, c);
				notasAlunos[l][c] = ler.nextDouble();
			}
			System.out.println();
		}
		for(int l=0; l<notasAlunos.length; l++) {
			for(int c=0; c<notasAlunos[l].length; c++) {
				System.out.printf(notasAlunos[l][c] + ", ");
			}
			System.out.println();
		}
		
		ler.close();

	}
}
