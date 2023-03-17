package TerceiraAtividade;

import java.util.Scanner;

public class ForExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		Scanner ler = new Scanner(System.in);
			
		int Number,Epar = 0,Eimpar = 0,x;
		
		System.out.println("\nDigite o 1° número:");
		Number = ler.nextInt();
		
		System.out.println("\nDigite o 2° número");
		Number = ler.nextInt();
			
		System.out.println("\nDigite o 3° número");
		Number = ler.nextInt();
		
		System.out.println("\nDigite o 4° número");
		Number = ler.nextInt();
		
		System.out.println("\nDigite o 5° número");
		Number = ler.nextInt();
		
		System.out.println("\nDigite o 6° número");
		Number = ler.nextInt();
		
		System.out.println("\nDigite o 7° número");
		Number = ler.nextInt();
		
		System.out.println("\nDigite o 8° número");
		Number = ler.nextInt();
		
		System.out.println("\nDigite o 9° número");
		Number = ler.nextInt();
		
		System.out.println("\nDigite o 10° número");
		Number = ler.nextInt();
		
		for( x = 1;x<=10; Number++) {
			
			if(Number % 2 == 0) {
				Epar++;
		
			}else { 
				Eimpar++;
		    }
		
	
	}	
				
    System.out.println("\nTotal de números pares :" +Epar);
    System.out.println("\nTotal de números ímpares :"+Eimpar);
	
	
	}

}
