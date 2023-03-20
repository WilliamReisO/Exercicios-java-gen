package TerceiraAtividade;

import java.util.Scanner;

public class Lista01For {

	public static void main(String[] args) {
		
		
		Scanner Leitura = new Scanner(System.in);
		
		
		int x,N1,N2;;
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		N1 = Leitura.nextInt();
		System.out.println("\nDigite o último número do intervalo: ");
		N2 = Leitura.nextInt();
	
		
		for(x=N1;x<N2;x++) {
	
			if((x % 3 == 0) && (x % 5 == 0 && (x !=0))) {
				
				System.out.println(x+" é múltiplo de 3 e 5");
			}}
			if(N1 >= N2 ){
				System.out.println("\nIntervalo inválido!");
				Leitura.nextInt();}
			
			
			
					
	}
	}	
		
