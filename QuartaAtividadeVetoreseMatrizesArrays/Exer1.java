package QuartaAtividadeVetoreseMatrizesArrays;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int [] Vetor = new int [10];
		int x, Num,Encontrado,cont=0;
		
		
		for(x = 0;x <=9; x++) {
			
			System.out.println("Entre com o "+(x+1)+"° Numero do Array :");
			Vetor [x] =ler.nextInt();
		}
		 	
		System.out.println("\nDigite o número que você deseja encontrar:");
		Num = ler.nextInt();
		
		for(x=0;x<9;x++){
			
			if(Vetor [x] == Num) {
				System.out.println("\nO Numero "+Num+" Se localisa na posição :"+(x+1));
				cont++;
		
			}
	
		}
			if (cont == 0){
				System.out.println("\nO número "+Num+" não foi encontrado !");	
		}
	
}
}