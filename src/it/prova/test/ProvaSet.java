package it.prova.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProvaSet {
	public static void main(String[] args) {

		// creo una set di stringhe e faccio delle aggiunte
		Set<String> setDiString = new HashSet<String>();
		setDiString.add("Ciao");
		setDiString.add("sono");
		setDiString.add("Francesco");

		// stampo la set
		System.out.println("le stringhe sono salvate in ordine afabetico " + setDiString);

		// creo una set di interi e provo la union, intersection e difference

		Set<Integer> numeriInsieme1 = new HashSet<Integer>();
		numeriInsieme1.addAll(Arrays.asList(new Integer[] { 6, 4, 7, 3, 7, 2, 7 }));
		Set<Integer> numeriInsieme2 = new HashSet<Integer>();
		numeriInsieme2.addAll(Arrays.asList(new Integer[] { 7, 6, 3, 8, 5, 3, }));

		// Unisco i miei due insimi usando il metodo addAll (senza avere ripetizioni di
		// elementi)
		Set<Integer> unioneInsieme = new HashSet<Integer>(numeriInsieme1);
		unioneInsieme.addAll(numeriInsieme2);
		System.out.println(unioneInsieme);

		// faccio l'intersezione dei miei insiemi ottenendo solo gli elementi in comune
		// tra loro
		Set<Integer> intersectionInsiemi = new HashSet<Integer>(numeriInsieme1);
		intersectionInsiemi.retainAll(numeriInsieme2);
		System.out.println(intersectionInsiemi);

		// faccio la differenza dei miei due insiemi tramite il metodo removeAll
		Set<Integer> differenceInsiemi = new HashSet<Integer>(numeriInsieme1);
		differenceInsiemi.removeAll(numeriInsieme2);
		System.out.println(differenceInsiemi);

	}

}
