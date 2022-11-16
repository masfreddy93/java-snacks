package org.booleancarrers.java;

import java.util.Scanner;

public class Snack1 {

	
	public static void main(String[] args) {
		
//		Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserire numero: ");
		int number = sc.nextInt();
		
		sc.close();
		
		
		if(number % 2 == 0) {
			System.out.println(number);
		} else {
			System.out.println(number + 1);
		}
	}
}
