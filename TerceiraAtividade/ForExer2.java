package TerceiraAtividade;

import java.util.Scanner;

public class ForExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
			
		int Number,Epar = 0,Eimpar = 0,x;
		
		
		for( x = 0;x <= 9; x ++ ) {
			
			System.out.println("\nDigite o "+(x+1)+"°número:");
		    Number = ler.nextInt();
			
			if(Number % 2 == 0) {
				Epar++;
		   
			}else if (Number % 2 == 1 ){ 
				Eimpar++;
				
		    }
	}	
	 System.out.println("\nTotal de números pares :" +Epar);
	 System.out.println("\nTotal de números ímpares :"+Eimpar);				

    
	
	
	}

}
