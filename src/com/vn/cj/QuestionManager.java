package com.vn.cj;

public class QuestionManager {
	public static void main(String[] args) {
		QuestionService qs = new QuestionService();
		double score = qs.startquiz();
		System.out.println("Congratulations! You Scored " + score + " Percent");

	}
}
