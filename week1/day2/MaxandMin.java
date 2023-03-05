package week1.day2;

import java.util.Arrays;

public class MaxandMin {
	
	public static void main(String[] args) {
		
		int[] nums = {98,67,89,90,65,999};
		//find the minimumvalue of this array
		Arrays.sort(nums);
		//to print minimum value
		System.out.println("The minimum value of this array is : "+ nums[0]);
		//to print maximum value
		System.out.println("The maximum value of this array is: " +nums[nums.length-1]);//nums[6-1]=nums[5]=999
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
