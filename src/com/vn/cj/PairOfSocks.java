package com.vn.cj;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PairOfSocks {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int numOfPairs = 0;
		boolean[] ar1 = new boolean[n];
		for (int i=0; i<n; i++) {
			ar1[i] = false;
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar[i] == ar[j]) && !ar1[i] && !ar1[j]) {
					numOfPairs++;
					ar1[i] = true;
					ar1[j] = true;
				}
			}
		
		}
		return numOfPairs;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("numofsocks"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
        System.out.println(result);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
