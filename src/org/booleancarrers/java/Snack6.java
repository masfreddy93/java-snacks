package org.booleancarrers.java;

public class Snack6 {
	
	public static void main(String[] args) {
		
		/*  Dati i seguenti array:

			int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
			int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
			calcolare un array sommatoria dove ogni elemento corrisponde alla somma degli elementi dei due array alla stessa posizione
			// Risultato atteso
			new int[] { 112, 95, ... }
			trovare il valore minimo all'interno di entrambi gli array
			trovare il valore massimo all'interno di entrambi gli array
			calcolare la media di entrambi gli array (assieme)
			calcolare la somma di tutti gli elementi di entrambi gli array */
		
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		int[] concate = new int[arr1.length + arr2.length];
		
		for(int i = 0; i < concate.length; i++) {
			
			if(i < (concate.length / 2)) {				
				concate[i] = arr1[i];
			}else {
				concate[i] = arr2[i-10];
			}
		}
		
		
		int[] arrSum = new int[arr1.length]; 
		
		for(int i = 0; i < arrSum.length; i++) {
			
			arrSum[i] = arr1[i] + arr2[i];
			System.out.print(arrSum[i] + " ");
		}
		
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		float avg = 0;
		int sum = 0;
		
		for(int i = 0; i < concate.length; i++) {
			
			if(concate[i] < min) {
				
				min = concate[i];
			}
			
			if(concate[i] > max) {
				
				max = concate[i];
			}
			
			sum += concate[i];
		}
		
		avg = sum / 20f;
		
		
		System.out.println("\n\nValore minimo: " + min);
		System.out.println("Valore massimo: " + max);
		System.out.println("Sommatoria: " + sum);
		System.out.println("Media: " + avg);
	}
}
