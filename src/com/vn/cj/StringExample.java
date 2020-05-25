package com.vn.cj;

public class StringExample {
	public static void main(String[] args) {
		String str = "x,y,10";
		String arr[] = str.split(",");
		for(String ele:arr) {
			System.out.println(ele);
		}
	}
}
