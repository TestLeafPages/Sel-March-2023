package week3.day1;

public class WordCount {

	public static void main(String[] args) {
		 //Problem = how many times e is occuring
	   String str = "TestLeaf";
	   char expChar = 'e';
	   int count=0;
	   char[] ch = str.toCharArray();
	   for (int i = 0; i < ch.length; i++) {
		   if (ch[i]==expChar) {
			count++;   
			
		}
	}
	  if (count>0) {
		System.out.println("The letter" +  expChar+" is occuring "+count+" times");
	}
	   

	}

}
