package org.booleancarrers.java;

import java.util.Random;

public class Snack4 {

	public static void main(String[] args){
			
		/* Creare due array di dimensione diversa e stampare un numero di valori interi casuali 
		pari alla differenza di dimensione 
		(es: arr1.length = 3; arr2.length = 10;  --> stampo 7 valori interi casuali) */
		
		Random r = new Random();
		
		int[] array1 = new int[22];
		String[] array2 = new String[12];
		
		int array1Lng = array1.length;
		int array2Lng = array2.length;
		int differenceOfLng = 0;
		
		
		if(array1Lng > array2Lng) {
			differenceOfLng = array1Lng - array2Lng;
		}else if(array2Lng > array1Lng) {
			differenceOfLng = array2Lng - array1Lng;
		}
		
		
		for(int i = 0; i < differenceOfLng; i++) {
			int value = r.nextInt();
			System.out.println(value);
		}
		
		
	}
}
