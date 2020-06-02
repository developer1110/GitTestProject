package com.vn.cj;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
	privateSystem.out.println(str.substring(i, j) + " Added"); ArrayList<Question> questions = new ArrayList<>();
	private Scanner sc;

	// static block to open file and load questions
	{
		try {
			
			sc = new Scanner(Paths.get("data\\quiz.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public QuestionService() {
		this.processFile(sc);
		sc.close();
	}

	public double startquiz() {
		double percent = 0;
		int right_answers = 0;
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			System.out.println("Are you ready for the Java Quiz (Y/N) ");
			String response = sc1.nextLine();
			if (response.equalsIgnoreCase("Y")) {
				for (Question q: questions) {
					System.out.println(q.question);
					q.alternatives.stream().forEach(System.out::println);
					System.out.println("Your Answer : ");
					String ans = sc1.nextLine();
					if (ans.equals(q.answer)) {
						right_answers++;
					}
							
				}
				sc1.close();
				return (right_answers/questions.size()) * 100;
			} else if (response.equalsIgnoreCase("N")) {
				sc1.close();
				break;
			}
					
		}
		
		return percent;
	}

	private void processFile(Scanner sc) {
		String question;
		ArrayList<String> alternatives = new ArrayList<>();
		String answer;
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			if (str.startsWith("#")) { // new question line found
				str = sc.nextLine();
				if (!str.isEmpty()) {
					question = str;
					while (sc.hasNextLine() && !str.startsWith("Ans:")) {
						str = sc.nextLine();
						if (str.startsWith("Ans:")) { // answer row found
							answer = str.substring(4);
							System.out.println(alternatives.toString());
							questions.add(new Question(question, alternatives, answer));
							question = null;
							alternatives = new ArrayList<>();
							// alternatives.clear();
							answer = null;
							break;
						} else { // alternative row found
							alternatives.add(str);
						}

					}
				}
			}
		}
	}

}
