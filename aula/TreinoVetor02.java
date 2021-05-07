package aula;

public class TreinoVetor02 {
	public static void main(String[] args) {
		
		double[] temperaturas = new double[5];
		
		temperaturas[0] = 32.0;
		temperaturas[1] = 28.5;
		temperaturas[2] = 25.0;
		temperaturas[3] = 40.0;
		temperaturas[4] = 09.0;
		
		
		// mostrar o tamanho do array
		System.out.println("O tamanho do vetor é: " + temperaturas.length);
		
		//percorrer o array todo
		
		for(int i=0; i <temperaturas.length; i++) {
			System.out.println("O dia é: " + (i+1));
			System.out.println("O valor da temperatura é " + temperaturas[i]);
			
			
		}
		
		
	}
	
	
	

}
