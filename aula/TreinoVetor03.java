package aula;

import java.util.Scanner;

public class TreinoVetor03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma= 0.0, media = 0.0;
		
		int i;
		
		
		for(i=0; i<=3; i++) {
			System.out.println("Digite a " + (i+1) + "° nota do aluno: ");
			notas[i] = ler.nextDouble();
			soma += notas[i];
			media = soma/4;
			
		} 
		System.out.println("A média deste aluno é: " + media);
		
		ler.close();

	}

}
