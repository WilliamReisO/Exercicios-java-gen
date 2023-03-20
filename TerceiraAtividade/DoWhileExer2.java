package TerceiraAtividade;

import java.util.Scanner;

public class DoWhileExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0 ,numero,mult=0;
		double Media;
		
		Scanner leia = new Scanner(System.in);
		
		do{
			
		System.out.println("\nDigite um numero:");
		numero = leia.nextInt();
			
		if(numero % 3 == 0 ) {		
			mult+=numero;
			x++;
		}
		}
		while(numero != 0) ;
		

		Media = mult /(x-1) ;
	
		
		System.out.printf("\nA média de todos os números múltiplos de 3 é %.2f:",Media);
	
		
	}
}