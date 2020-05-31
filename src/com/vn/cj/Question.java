package com.vn.cj;

import java.util.ArrayList;

public class Question {
	String question;
	ArrayList<String> alternatives;
	String answer;
	
	public Question(String question, ArrayList<String> alternatives, String answer) {
		super();
		this.question = question;
		this.alternatives = alternatives;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public ArrayList<String> getAlternatives() {
		return alternatives;
	}

	public void setAlternatives(ArrayList<String> alternatives) {
		this.alternatives = alternatives;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [question=" + question + ", alternatives=" + alternatives + ", answer=" + answer + "]";
	}
	
	
	
	
	
}
