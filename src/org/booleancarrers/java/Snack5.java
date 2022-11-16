package org.booleancarrers.java;

public class Snack5 {

	public static void main(String[] args) {
		
		/* Dato il seguente array:

			int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
			trovare il valore minimo
			trovare il valore massimo
			calcolare la media
			calcolare la sommatoria */
		
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
//		int min = arr[0]; //NON è SBAGLIATO! però come hai visto nello snack 8 può creare problemi...
		int min = Integer.MAX_VALUE;  //prende il valore INT più alto possibile
//		int max = arr[0];
		int max = Integer.MIN_VALUE; //stesso principio di qll sopra
		float avg = 0;
		int sum = 0; //inizializzarla sempre a 0
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < min) {
				
				min = arr[i];
			}
			
			if(arr[i] > max) {
				
				max = arr[i];
			}
			
			sum += arr[i];
		}
		
		avg = sum / 10f;
		
		
		System.out.println("Valore minimo: " + min);
		System.out.println("Valore massimo: " + max);
		System.out.println("Sommatoria: " + sum);
		System.out.println("Media: " + avg);	
	}
}
