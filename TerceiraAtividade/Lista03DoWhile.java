package TerceiraAtividade;

import java.util.Scanner;

public class Lista03DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitura = new Scanner(System.in);
		
		int numero,numPos = 0;
			
		do {
		System.out.println("\nDigite um  Número:");
		numero = leitura.nextInt();
	
			
		  if(numero > 0) {
		  numPos += numero;
		  }else {
			  
		  }		
			
		}while (numero != 0);
		
		System.out.println("\nA soma dos números positivos é:"+numPos);
	
		
	}

}
