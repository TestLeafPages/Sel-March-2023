package week1.day1;

public class LearnContinue {
	public static void main(String[] args) {
		//type for->ctrl+space->click second for loop ->Enter
		for (int i = 10; i >=1; i--) {
			
			if (i==7) {//7==7
				System.out.println("Seven");
				continue;
				
			}
			System.out.println(i);//10 9 8 seven
		}
System.out.println("Out of for loop");
		
	}
}
