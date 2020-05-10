package com.nikhil.sapient;

import java.util.ArrayList;
import java.util.Scanner;


public class JavaProgram {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Question q1 = new Question("Who is the president of India ?","Donald Trump","Ramnath Kovind","Narendra Modi","None", "Ramnath Kovind");
		Question q2 = new Question("Who played Tony Stark in the movie , Avengers ?", "Steve Rogers", "Robert Downey Jr.", "Chris Hemsworth", "None", "Robert Downey Jr.");
		
		ArrayList<Question> questions = new ArrayList<>();
		questions.add(q1);
		questions.add(q2);
		
		for(Question q: questions) {
			System.out.println(q.getQuestion());
			int a = 65;
			ArrayList<String> options = q.getOptions();
			for(String option: options) {
				System.out.println((char)a + " " + option);
				a+=1;
			}
			
			String ans = reader.nextLine();
			if(!(ans.equals(q.getCorrectOpt()))) {
				System.out.println("Sorry, wrong answer");
			}
		}
		
	}
}