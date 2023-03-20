package SegundaAtividade;

import java.util.Scanner;

public class SegundoExercicioSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner ler = new Scanner (System.in);
			
		int n1=10,n2=15,n3=18,n4=12,n5=8,n6=13,ValorTotal,opcao,NumItems;
		
		System.out.println("\n OPÇOES DA LANCHONETE \n");
		System.out.println("\n1- Cachorro Quente");
		System.out.println("\n2- X-Salada");
		System.out.println("\n3- X-Bacon");
		System.out.println("\n4- Bauru");
		System.out.println("\n5- Refrigerante");
		System.out.println("\n6- Suco de laranja\n");
		System.out.println("\nEscolha uma opção de 1 a 6 :");
		opcao=ler.nextInt();
		System.out.println("\nQuantas unidades do item ? ");
		NumItems = ler.nextInt();
		
		ValorTotal= NumItems * opcao;
		
		switch(opcao) {
		
				case 1:
					ValorTotal = NumItems * n1 ;
					System.out.println("\nCachorro Quente\n");
					System.out.println("\nValor Total : R$ "+ValorTotal);
				break;
				
				case 2 :
					ValorTotal = NumItems * n2 ;
					System.out.println("\nX-Salada\n");
					System.out.println("\nValor Total : R$ "+ValorTotal);
				break;
				
				case 3 :
					ValorTotal = NumItems * n3 ;
					System.out.println("\nX-Bacon");
					System.out.println("\nValor Total : R$ "+ValorTotal);
					break;
					
				case 4 :
					ValorTotal = NumItems * n4 ;
					System.out.println("\nBauru");
					System.out.println("\nValor Total : R$ "+ValorTotal);
					break;
				case 5 :
					ValorTotal = NumItems * n5 ;
					System.out.println("\nRefrigerante");
					System.out.println("\nValor Total : R$ "+ValorTotal);
					break;
				case 6 :
					ValorTotal = NumItems * n6 ;
					System.out.println("\nSuco de laranja");
					System.out.println("\nValor Total : R$ "+ValorTotal);
					break;
		}
		
		
	
	}

}
