package org.booleancarrers.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		
		/* Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, 
		e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome. */
		
		
		Random r = new Random();
		
		String[] nomi = {"Mario", "Giuseppe", "Anna", "Cristina", "Luca"};
		String [] cognomi = {"Verdi", "Rossi", "Bianchi", "Lopez", "Busi"};
		
		String[] nomiCompleti = new String[5];
		
		System.out.println("Lista invitati: \n");
		for(int i = 0; i < nomi.length; i++) {
			
//			System.out.println(nomi[i] + ' ' + cognomi[i]);
			
			String nome = nomi[i];
			
			int indiceCognome = r.nextInt(cognomi.length);
			String cognome = cognomi[indiceCognome];
			
			String nomeCompleto = nome + " " + cognome;
			nomiCompleti[i] = nomeCompleto;
			
			System.out.println(nomeCompleto);
			
		}
	}
}
