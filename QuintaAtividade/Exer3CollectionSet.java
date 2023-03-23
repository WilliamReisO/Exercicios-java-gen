package QuintaAtividade;


import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;
import java.util.Set;

public class Exer3CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Ler = new Scanner(System.in);
		int Numero;
		
		Set<Integer> Listaset = new HashSet<Integer>();

		for (int x = 0; x < 10; x++) {

			System.out.println("\nDigite "+(x+1)+"° um numero");
			Numero = Ler.nextInt();
			Listaset.add(Numero);
		}

		System.out.println("\nListar dados do Set:");

		Iterator<Integer> iListaset = Listaset.iterator();

		while (iListaset.hasNext()) {

			System.out.println(iListaset.next());
		}

	}

}
