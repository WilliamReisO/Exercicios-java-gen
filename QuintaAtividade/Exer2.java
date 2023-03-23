package QuintaAtividade;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		 
		ArrayList<Integer> Numero = new ArrayList<Integer>();
		
		int valor,x;
		
		for(x = 0;x <10; x++) {
			
			System.out.println("Entre com o "+(x+1)+"° Numero do Array :");
			valor=ler.nextInt();
			Numero.add(valor);
		}
		 	
		ler.next();
		System.out.println("\nDigite o número que você deseja encontrar:");
		valor= ler.nextInt();
		
		int posicao = Numero.indexOf(valor);
		
		if (posicao!= - 1) {	
			System.out.println("\nO Numero "+valor+" Se localisa na posição :"+(posicao+1));
			}else {
				System.out.println("\nO número "+valor+" não foi encontrado !");}	
	
	
	}
}
