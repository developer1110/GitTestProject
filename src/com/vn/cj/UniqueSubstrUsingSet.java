package com.vn.cj;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSubstrUsingSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		sc.close();
		int strLen = str.length();
		Set<String> sbArray = new LinkedHashSet<String>();
		for (int i = 0; i < strLen; i++) {
			for (int j = strLen; j >= i + 1; j--) {
				// set should add only those substrings which 
				if ( sbArray.add(str.substring(i, j)) ) {
					System.out.println(str.substring(i, j) + " Added");
				} else {
					System.out.println(str.substring(i, j) + " Is Duplicate");
				}

			}
		}
		for (String strEle : sbArray) {
			System.out.print(strEle + " ");
		}
	}

}
