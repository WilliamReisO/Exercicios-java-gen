package PrimeiraAtividade;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome ="William Reis";
		
		double nota1,nota2,nota3,nota4,media;

		Scanner ler = new Scanner (System.in);
		

		System.out.println("\nEntre com a primeira nota: ");
		nota1= ler.nextDouble();
		System.out.println("\nEntre com a Segunda nota: ");
		nota2= ler.nextDouble();
		System.out.println("\nEntre com a Terceira nota: ");
		nota3= ler.nextDouble();
		System.out.println("\nEntre com a Quarta nota: ");
		nota4= ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nMédia aritmética foi de : %.2f" , media);
		

	}

}
