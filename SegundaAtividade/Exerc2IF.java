package SegundaAtividade;

import java.util.Scanner;

public class Exerc2IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner ler = new Scanner(System.in);
		
		int Num;
		
		System.out.println("\nDigite um número :");
		Num = ler.nextInt();
		
		
		if(( Num > 0) && (Num % 2 == 0)) {
			System.out.println("\nO Número "+Num+" é par é positivo!");
		}
		else if(( Num < 0) && (Num % 2 == 1)){
			System.out.println("\nO Número "+Num+"é impar é Negativo!");
		}
		else if (( Num > 0) && (Num % 2 == 0)){
			System.out.println("\nO Número "+Num+" é impar é positivo!");
		}
		else if (( Num < 0) && (Num % 2 == 0)){
			System.out.println("\nO Número "+Num+" é par e Negativo");
		}
		

	}

}
