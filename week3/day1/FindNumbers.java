package week3.day1;

public class FindNumbers {

	public static void main(String[] args) {
        String input = "Chennai 600128";
        //Output=600128
        String numbers = input.replaceAll("[^0-9]", "");
      
        int convertedString = Integer.parseInt(numbers);
        System.out.println(convertedString);
        
        
        String word = input.replaceAll("[^a-zA-Z]", "");
        System.out.println(word);
        

	}

}
