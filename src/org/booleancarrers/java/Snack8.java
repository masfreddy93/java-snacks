package org.booleancarrers.java;

import java.util.Random;

public class Snack8 {
	
	public static void main(String[] args) {
		
		/* Creare un array di 10 elementi interi random compresi tra -50 e +50 
		 * (utilizzare l'oggetto random con seed 128 new Random(128))

				// Risultato atteso
				new int[] { 39, -32, -48, 25, 17, -27, 8, -13, -30, 40 }
				trovare il valore assoluto piu' grande e stampare il valore corrispondente
				// Risultato atteso
				(int) -48
				trovare il valore assoluto piu' piccolo e stampare il valore corrispondente
				// Risultato atteso
				(int) 8
				calcolare la sommatoria dei valori multipli di 5
				// Risultato atteso
				(int) 35  */
		
		
		Random r = new Random(128);
		int[] arr = new int[10];
		
		int maxAbs = 0;
		int minAbs = Integer.MAX_VALUE;
		int sumMultipleOfFive = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			
			int value = r.nextInt(100);
			arr[i] = value - 50;
			System.out.print(arr[i] + " ");
			
			
			if(Math.abs(arr[i]) > Math.abs(maxAbs)) {
				
				maxAbs = arr[i];
			}
			
			if(Math.abs(arr[i]) < Math.abs(minAbs)) {

				minAbs = arr[i];
			}
			
			if(arr[i] % 5 == 0) {
				
				sumMultipleOfFive += arr[i];
			}
		}
		
		
		System.out.println("\n\nValore assoluto più grande: " + maxAbs);
		System.out.println("Valore assoluto più piccolo: " + minAbs);
		System.out.println("Sommatoria multipli di 5: " + sumMultipleOfFive);
		
	}
}
