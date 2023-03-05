package week1.day2;

import java.util.Arrays;

public class LearnArraywithAnotherExample {
	
	public static void main(String[] args) {
		//store subjects
		String[] subjects = {"English","Maths","Tamil","Science","Social science","Generalknowledge"};
		//to sort an array
		Arrays.sort(subjects);
		int len = subjects.length;
		System.out.println(len);
				
		for (int i = len-1; i >=0; i--) {
			System.out.println(subjects[i]);
		}
		
		String[] mentorNames = new String[4];
		mentorNames[0]="Vidhya";
		mentorNames[1]="Aravind";
		mentorNames[2]="Easwer";
		mentorNames[3]="Dilip";
		
	}

}
