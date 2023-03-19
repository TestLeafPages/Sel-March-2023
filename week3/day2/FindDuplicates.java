package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums = {2,3,4,7,2,6,4,7};
		//Output=2,4,7 Print only the duplicate values
		Set<Integer> unique = new TreeSet<>();
		Set<Integer> duplicates = new TreeSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);
			if (!add) {
				duplicates.add(nums[i]);
			}
		}
		
		System.out.println(duplicates);

	}

}
