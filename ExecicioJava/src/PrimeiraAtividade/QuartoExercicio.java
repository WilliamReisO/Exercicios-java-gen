package PrimeiraAtividade;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in); 
		
		double n1,n2,n3,n4,Calc;
		
		System.out.println("\nInsira o primeira valor: ");
		n1= ler.nextDouble();
		System.out.println("\nInsira o Segunda valor: ");
		n2= ler.nextDouble();
		System.out.println("\nInsira o Terceira valor: ");
		n3= ler.nextDouble();
		System.out.println("\nInsira o Quarto valor: ");
		n4= ler.nextDouble();
		
		Calc = (n1 * n2)-(n3 * n4);
		
		System.out.println("\nEssa é a Diferença:"+Calc);
	}

}
