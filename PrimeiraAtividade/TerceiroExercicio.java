package PrimeiraAtividade;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double SalarioBruto,AdicNotur,HExt,Desc,SaLiqui;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nQual seu Salario Bruto ?");
		SalarioBruto = ler.nextDouble();
		System.out.println("\nQual o Adiconal Noturno? ");
		AdicNotur = ler.nextDouble();
		System.out.println("\nQuantas Horas Extras? ");
		HExt = ler.nextDouble();
		System.out.println("\nO Descontos ?");
		Desc = ler.nextDouble();
		
		
		SaLiqui = SalarioBruto + AdicNotur + (HExt * 5 ) - Desc;
 
		System.out.println("\nSeu Salário Líquido é : " + SaLiqui);
	}

}
