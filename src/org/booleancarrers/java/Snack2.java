package org.booleancarrers.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		
		/* Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, 
		e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome. */
		
		Random r = new Random();
		
		
		String[] nomi = {"Mario", "Giuseppe", "Anna", "Cristina", "Luca"};
		String [] cognomi = {"Verdi", "Rossi", "Bianchi", "Lopez", "Busi"};
		
		
		System.out.println("Lista invitati: \n");
		for(int i = 0; i < nomi.length; i++) {
			
			System.out.println(nomi[i] + ' ' + cognomi[i]);
		}
	}
}
