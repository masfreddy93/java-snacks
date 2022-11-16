package org.booleancarrers.java;

public class Snack3 {
	
	public static void main(String[] args){
		
//		Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
		
		
		int[] numbers = {1, 3, 6, 8, 12, 15, 2};
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			if((i+1) % 2 != 0) {
				
				sum += numbers[i];
			}
		}
		
		System.out.println("Somma elementi in posizione dispari: " + sum);
	}
}
