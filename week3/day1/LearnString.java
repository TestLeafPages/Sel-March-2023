package week3.day1;

public class LearnString {
	public static void main(String[] args) {
		//String literal-String pool
		String str1 = "TestLeaf";
		String str2 = "Testleaf";
		
		//find the length of a String
		int length = str1.length();
		System.out.println("The length of "+str1+" is "+ length);
		
		//to check if a char is present or not
		//str1=str1.toLowerCase();
//		boolean isPresent = str1.contains("leaf");
//		System.out.println(isPresent);
		if (str1.contains("Leaf") || str1.contains("leaf")) {
			System.out.println("Is Present");
		}
		else {
			System.out.println("Not present");
		}
		
		//to convert a String to array of characters
		char[] charArray = str1.toCharArray();
		System.out.println(charArray[2]);//T e s t l e a f
		//                                 0 1  2 3 4 5 6 7
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);//T e s t l e a f
		}
		
		//to compare two Strings
		boolean equals = str1.equals(str2);
		System.out.println(equals);
		
		//to compare two Strings ignoring case sensitivity
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println(equalsIgnoreCase);
		
		String substring = str1.substring(4);
		System.out.println(substring);
		
		String substring2 = str1.substring(2, 6);
		System.out.println(substring2);
		
		
		
	}

}