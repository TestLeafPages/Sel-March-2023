package week1.day2;

public class Fibinocci {
	
	//output: 0  1  1  2  3  5  8  13  21  34  55  89  144
//	Hints: 
//
//		Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
//		Print first number
//		Iterate from 1 to the 11
//		Add first and second number assign to sum
//		Assign second number to the first number
//		Assign sum to the second number
//		Print sum

	public static void main(String[] args) {
		 int firstNum = 0;
		 int secNum   = 1;
		 int sum      = 0;
		 System.out.println(firstNum);//0
		 System.out.println(secNum);//1
		 for (int i = 0; i < 11; i++) {
			sum=firstNum+secNum;//0+1  1+1 1+2 2+3
 			System.out.println(sum);//1 2 3 5
			firstNum=secNum;//1 1 2
			secNum  = sum;//1 2 3
			
			
		}
		 
		 
		 
		
		
		
		
	}

}
