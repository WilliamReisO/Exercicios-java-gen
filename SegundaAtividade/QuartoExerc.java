package SegundaAtividade;

import java.util.Scanner;

public class QuartoExerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.nextLine();
		System.out.println("\nEntre com a Segunda palavra: ");
		palavra2 = ler.nextLine();
		System.out.println("\nEntre com a Terceira palavra: ");
		palavra3 = ler.nextLine();

		if(palavra1.equalsIgnoreCase("vertebrado")){
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("\nÉ uma Águia");
					}else {
						System.out.println("\nÉ uma Pombo");
					}
			}else {
				if(palavra3.equalsIgnoreCase("Onívoro")){
					System.out.println("\nÉ uma Homem");
						}else{
							System.out.println("\nÉ uma Vaca");
						}
					}
					
				}else {
					if(palavra2.equalsIgnoreCase("Inseto")){
						if(palavra3.equalsIgnoreCase("Hematófago")){
							System.out.println("\nÉ uma Pulga");
						}else {
							System.out.println("\nÉ uma Largata");
						}
					}else {
						if(palavra3.equalsIgnoreCase("Hematófago")) {
							System.out.println("\nÉ uma Sanguessuga");
						}else {
							System.out.println("\nÉ uma Minhoca");
						}
					}
					
				}
				
				
				
			}
			
			

	
}

