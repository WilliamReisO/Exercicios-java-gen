package QuartaAtividadeVetoreseMatrizesArrays;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		
		
		int[][] Matriz = new int [3][3];
		int colu ,Lin,somaPrinc = 0,somaSecun = 0;; 
		
				
		for (Lin=0;Lin<3;Lin++) {
			for(colu=0;colu<3;colu++) {
				System.out.println("\nEntra com os Números : ");
				Matriz[Lin][colu] = ler.nextInt();
			}
			}
		
		System.out.println("\n\nElementos da Diagonal Principal:\n");
		for (Lin=0;Lin<3;Lin++) 
			System.out.print(Matriz[Lin][Lin]);
			
			
		System.out.println("\nElementos da Diagonal Secundária:");
		for (Lin=0;Lin<3;Lin++) 
				System.out.print(Matriz[Lin][3-1-Lin]);
			
		    
	
		System.out.println("\nSoma dos Elementos da Diagonal Principal:");
		for (Lin=0;Lin<3;Lin++) 	
			somaPrinc+=Matriz[Lin][Lin];
			System.out.println(somaPrinc);
		
		
		System.out.println("\nSoma dos Elementos da Diagonal Secundrio :");
		for (Lin=0;Lin<3;Lin++) 
		somaSecun+=Matriz[Lin][3-1-Lin];			
		System.out.println(somaSecun);
		
		
	
		
}
}
