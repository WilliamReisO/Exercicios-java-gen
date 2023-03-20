package PrimeiraAtividade;

import java.util.Scanner;

public class PrimeiroExercico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario,abono,novosala;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite seu Salário: ");
		salario = leia.nextDouble();
		System.out.println("\nDigite seu Abono: ");
		abono= leia.nextDouble();
		
		novosala = salario + abono;
		
		System.out.print("\nSeu Novo Salário: "+novosala);
		
		

	}

}
