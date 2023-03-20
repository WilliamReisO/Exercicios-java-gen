package SegundaAtividade;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		float A,B,C,soma;
	
		System.out.println("\nDigite o número A :");
		A= ler.nextFloat();
		System.out.println("\nDigite o número B :");
		B= ler.nextFloat();
		System.out.println("\nDigite o número C :");
		C= ler.nextFloat();
		
		soma=A+B;
		
		if(soma > C) {
			System.out.println("\nA Soma de A + B é Maior do que C:");
		}
		else if (soma < C) {
			System.out.println("\nA Soma de A + B é Menor do que C:");
		}
		else  {
			System.out.println("\nA Soma de A + B é Igual a C :");
		}
		

	}

}
