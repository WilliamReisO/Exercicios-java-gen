package TerceiraAtividade;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Leitura = new Scanner(System.in); 
		
		int idade,sexo,categoria, x ,FemFront=0,MasMobi = 0,N;
		float Masc = 0,Fem = 0,Outro = 0;
		float Back = 0,Front = 0,Mobi = 0,Fullstack = 0;
		
		
	
 
		 
   while(Leitura = N){
 
	 	 System.out.println("\nDigite sua Idade :");
		 idade = Leitura.nextInt();
		
	
		 System.out.println("\nDigite seu gênero biológico ");
		 sexo = Leitura.nextInt();
		 
	switch(sexo) {	 
	
 		caso 1 : Masc++;
 		break;
 		caso 2 : Fem++;
 		break;
 		caso 3 : Outro++;
 		break;
 	}	 
	
 	 System.out.println("\nCategoria");
     categoria = Leitura.nextInt();
 	
 	switch(categoria){
 	
 		caso 1 : Back++;
 		break;
 		caso 2 : Front++;
 		break;
 		caso 3 : Mobi++;
 		break;
 		Caso 4 : Fullstack++;
 		break;

	}
 	
 	 if (idade > 40 && sexo == 1 && categoria == 3){
		 MasMobi++;
	 }	
     
 	
 	System.out.println("\nDeseja continuar (S/N):");
 	N = Leitura.nextLine();
 	
 	}
}
 			System.out.println("\O número de pessoas desenvolvedoras Backend :"+Back);
 			System.out.println("\O número de mulheres desenvolvedoras Frontend:"+FemFront);
 			System.out.println("\O número de homens desenvolvedores Mobile maiores de 40 anos");
 			System.out.println("\O número de mulheres desenvolvedoras FullStack menores de 30 anos");
	 
	}

}
