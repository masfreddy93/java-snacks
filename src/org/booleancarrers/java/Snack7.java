package org.booleancarrers.java;

public class Snack7 {
	
	public static void main(String[] args) {
		
		/* Dato il seguente array:

			String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
			creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine
			creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine inverso
			trovare e stampare la parola piu' lunga e la sua lunghezza
			trovare e stampare la parola piu' corta e la sua lunghezza */
		
		
		
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		String concatWords = "";
		String concatWordsInverse = "";
		String shorterWord = words[0];
		String longerWord = words[0];
		
		for (int i = 0; i < words.length; i++) {
			
			concatWords += words[i];
			
			
			if(words[i].length() < longerWord.length()) {
				
				shorterWord = words[i];
			}
			
			if(words[i].length() > longerWord.length()) {
				
				longerWord = words[i];
			}
		}
		
		
		for (int i = (words.length - 1); i >= 0; i--) {
				
			concatWordsInverse += words[i];
		}
		
		
		System.out.println("Normal concat: " + concatWords);
		System.out.println("Concat inverted: " + concatWordsInverse);
		System.out.println("Parola più corta: " + shorterWord);
		System.out.println("Lunghezza parola più corta: " + shorterWord.length());
		System.out.println("Parola più corta: " + longerWord);
		System.out.println("Lunghezza parola più corta: " + longerWord.length());
	}
}
