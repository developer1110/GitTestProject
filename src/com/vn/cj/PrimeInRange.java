package com.vn.cj;

import java.util.Scanner;

public class PrimeInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Lower Bound : ");
		int num1 = sc.nextInt();
		boolean isPrime = true;

		System.out.println("Enter Upper Bound : ");
		int num2 = sc.nextInt();
		int len = 0;
		for (int i = num1; i <= num2; i++ ) {
			isPrime = true;
			for (int j = 2; j <= i/2; j++) {
				if ( i % j == 0) {
					isPrime = false;
				}
			}	
			if ( isPrime && i > 1) {
				System.out.print( i + " ");
				len += String.valueOf(i).length() + 1;
				if (len >= 80) {
					System.out.println();
					len = 0;
				}
			}
		}

		sc.close();

	}
}
