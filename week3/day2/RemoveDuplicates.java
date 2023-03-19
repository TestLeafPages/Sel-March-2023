package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {2,3,4,2,3,5,7,5};
		//Output=2,3,4,5,7
		Set<Integer> names = new LinkedHashSet<>();
		for (int i = 0; i < nums.length; i++) {
			
			names.add(nums[i]);
		}
		System.out.println(names);
		
	}

}
