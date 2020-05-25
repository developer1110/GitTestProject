package com.vn.cj;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		sc.close();
		int strLen = str.length();
		ArrayList<String> sbArray = new ArrayList<String>();
		for (int i = 0; i < strLen; i++) {
			for (int j = strLen; j >= i + 1; j--) {
				if (!checkUnique(sbArray, str.substring(i, j)) || sbArray.isEmpty()) 
					sbArray.add(str.substring(i, j));

			}
		}
		for (String strEle : sbArray) {
			System.out.println(strEle);
		}
	}

	static boolean checkUnique(ArrayList<String> als, String str) {
		for (String strEle : als) {
			//System.out.println("in CU 1 " + strEle);
			//System.out.println("In CU2 " + str);
			if (str.equals(strEle)) {
				return true;
			}
		}
		return false;
	}
}
