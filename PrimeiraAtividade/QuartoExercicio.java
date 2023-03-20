package PrimeiraAtividade;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in); 
		
		float n1,n2,n3,n4,Calc;
		
		System.out.println("\nInsira o primeira valor: ");
		n1=  ler.nextFloat();
		System.out.println("\nInsira o Segunda valor: ");
		n2=  ler.nextFloat();
		System.out.println("\nInsira o Terceira valor: ");
		n3=  ler.nextFloat();
		System.out.println("\nInsira o Quarto valor: ");
		n4=  ler.nextFloat();
		
		Calc = (n1 * n2)-(n3 * n4);
		
		System.out.println("\nEssa é a Diferença:"+Calc);
	}

}
