package week9.day1;

public class LearnTryCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int[] values = {10,20,30}; //0,1,2

		try {
			
			System.out.println(x / y); //2
			System.out.println(values[3]);
			
		} 
		
		catch (ArithmeticException e) {
			System.out.println("take default value for y as 1 when we get 0");
			System.out.println(x/1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("End of program");

	}

}
