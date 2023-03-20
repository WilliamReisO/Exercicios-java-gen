package TerceiraAtividade;

import java.util.Scanner;

public class Lista02While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in); 
		
		int idade,Menor21 = 0,Maior50 = 0;
		
		System.out.println("\nDigite uma idade: ");
		idade = ler.nextInt();
		//o laço so terina quando o numero for negativo 
		
		while(idade >= 0) {
			
			if(idade < 21) {
				Menor21++;
			}else if(idade > 50) {
				Maior50++;
			}
			
			System.out.println("\nDigite uma idade: ");
			idade = ler.nextInt();
				
			}
		System.out.println("\nTotal de pessoas menores de 21 anos:"+Menor21);
		System.out.println("\nTotal de pessoas maiores de 50 anos:"+Maior50);
		}
		

}
