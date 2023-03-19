package week3.day1;

public class ReverseString {
	public static void main(String[] args) {
	
		String str = "Amazon";
		str=str.toLowerCase();
		//Output=nozama
		//PseudoCode
		//Convert to charArray
		char[] ch = str.toCharArray();
		//Iterate through a reverse loop
		for (int i = ch.length-1; i >=0 ; i--) {
			
			//Print it in the console
			System.out.print(ch[i]);
		}
		
	}


	
}
