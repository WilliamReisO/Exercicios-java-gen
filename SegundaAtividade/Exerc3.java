package SegundaAtividade;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		String Nome;
		boolean Doacao;
		int idade;
		
		System.out.println("\nDigite o Nome do Doador");
		Nome = ler.nextLine();
		System.out.println("\nDigite a Idade do Doador");
		idade = ler.nextInt();
		System.out.println("\nPrimeira doação de sangue ?");
		Doacao = ler.nextBoolean();
		
		
		if(idade > 18 && idade < 59) {
			System.out.println(Nome+"\nEstá apto para doar sangue!");
			
		}else if (idade >= 60 && idade <= 69 && Doacao == false){
			System.out.println(Nome+"\nEstá apta para doar sangue!");
		}else {
			System.out.println(Nome+"\nNão está apta para doar sangue!");
		}
		
	}

}
