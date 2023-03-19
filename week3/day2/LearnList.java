package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> mentorNames = new ArrayList<String>();
		//to add elements into a List
		mentorNames.add("Aravind");
		mentorNames.add("Vidhya");
		mentorNames.add("Raghu");
		mentorNames.add("Easwar");
		mentorNames.add("Dilip");
		mentorNames.add(1, "Raghu");
		
		System.out.println(mentorNames);
		
		//to find the size of a list
		int size = mentorNames.size();
		System.out.println(size);
		
		//to remove an element from a list
		mentorNames.remove("Dilip");
		System.out.println(mentorNames);
		
		//to retrieve an element from a List
		String name = mentorNames.get(3);
		System.out.println(name);
		
		//to remove all the elements from a list
		mentorNames.clear();
		System.out.println(mentorNames);
		
		

	}

}
