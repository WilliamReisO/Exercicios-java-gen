package QuintaAtividade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int op ;
		ArrayList<String> Estojo = new ArrayList();
		
		for(op=0;op<5;op++) {
			
			System.out.println("\nDigite cores : ");
			String cor = leia.nextLine();
			Estojo.add(cor);
			
		}
			System.out.println("\nCores no estojo:");
			System.out.println(Estojo);
			
			Collections.sort(Estojo);
			System.out.println("\nCores de forma ordenada ...");
			System.out.println(Estojo);
	
	}

}
	
