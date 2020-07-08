package com.vn.cj;

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English Input : ");
		String line = sc.nextLine();
		String[] strArr = line.split(" ");
		for (String str : strArr) {
			System.out.print(convertToPigLatin(str) + " ");
		}
		sc.close();
	}

	private static String convertToPigLatin( String inputstr) {
		String outputstr = null;
		if (inputstr.matches("^[0-9]")) {
			outputstr = inputstr;
		} else {
			outputstr = inputstr.substring(1) + inputstr.substring(0, 1) + "ay";
		}
		
		return outputstr;
		
	}
}
