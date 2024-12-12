package Citta;

import java.util.ArrayList;

public class Citta {

	public static void main(String[] args) {
		
		//creo ArrayList di stringhe che chiamo "città"
		ArrayList<String> citta = new ArrayList<String>();
		
		//aggiungo le città all'ArrayList
		citta.add("Roma");
		citta.add("Torino");
		citta.add("Bari");
		citta.add("Firenze");
		citta.add("Milano");
		
		//richiamo i metodi 
		lista(citta);
		System.out.println();
		rimuovi(citta);
	}
	//creo un metodo per stampare la lista delle città contenute nell'Array tramite un ciclo for each
	public static void lista(ArrayList<String> citta) {
		for (String i : citta) {
			System.out.println(i);
		}
	}
	//creo un metodo per rimuovere una città dall'ArrayList e ristampare l'elenco aggiornato, richiamando al suo interno il metodo lista
	public static void rimuovi(ArrayList<String> citta) {
		citta.remove(1);
		System.out.println("LISTA AGGIORNATA ");
		lista(citta);
	}

}
/*
 * 1) Creazione e gestione di un ArrayList
 * 
 * Crea un programma che:
 * 
 * Crei un ArrayList di stringhe. Aggiunga i nomi di 5 città. Stampi tutte le
 * città contenute nella lista. Rimuova la seconda città. Stampi nuovamente le
 * città aggiornate.
 * 
 * Obiettivo: Comprendere le operazioni di base sugli ArrayList: aggiunta,
 * rimozione e iterazione.
 */