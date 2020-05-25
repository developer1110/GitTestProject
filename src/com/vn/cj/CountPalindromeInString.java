package com.vn.cj;

import java.util.Scanner;

public class CountPalindromeInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		sc.close();
		int strLen = str.length();
		int count = 0;
		for (int i = 0; i < strLen; i++) {
			for (int j = strLen; j > i + 1; j--) {
				StringBuffer sb = new StringBuffer();
				sb.append(str.substring(i, j)).reverse();
				// System.out.println(sb);
				// System.out.println(str.substring(i, j));
				if (sb.toString().contentEquals(str.substring(i, j))) {
					count++;
					System.out.println(str.substring(i, j));
				}

			}
		}
		System.out.println("There are " + count + " Palindromes in the input string");
	}
}
