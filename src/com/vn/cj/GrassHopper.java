package com.vn.cj;

import java.util.Scanner;

public class GrassHopper {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	
	int current_hop = 0;
	int num_hops = 0;
	while (current_hop < m) {
		if ( current_hop + n <= m ) {
			num_hops++;
			current_hop += n;
		} else {
			num_hops++;
			current_hop++;
			
		}
	}
	System.out.println(num_hops);
	sc.close();
}
}
