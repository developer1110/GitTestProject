package com.vn.cj;

import java.util.Scanner;

public class NumberOfStreaks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll("\\s", "");
		System.out.println(input);
		int i = 0;
		int max_streak = 0;
		int current_streak = 0;
		while (i < input.length() - 1) {
			if (input.charAt(i) == 'Y') {
				for (int j = i; j < input.length(); j++, i++) {
					if (input.charAt(j) != 'Y') {
						current_streak = 0;
						
						break;
					} else {
						// streak

						current_streak++;
						if (current_streak > max_streak) {
							max_streak = current_streak;
						}
						
					}
				}
			} else {
				i++;
			}
		}
		System.out.println(max_streak);
		sc.close();
	}
}
