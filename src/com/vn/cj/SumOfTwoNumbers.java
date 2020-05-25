package com.vn.cj;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fist Number : ");
		num1 = sc.nextInt(16);
		System.out.println("Enter Second Number : ");
		num2 = sc.nextInt(16);
		System.out.format("Sum of Two Numbers is : %x" , num1 + num2);

	}

}
