package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException
		//datatype[] variableName = {Values};
		//index                      0  1  2   3 4
		int[]         scores      = {89,98,80,78,92};
		Arrays.sort(scores);
//      78 - 0
//		80 - 1
//		89 - 2
//		92 - 3
//		98 - 4
		//to find the length of an  array
		int len = scores.length;
		System.out.println("The length of this array is :"+ len);
        //to retrieve a single element
		//System.out.println(scores[2]);
		//to print all the datas of this array
		//              4 <= 4
		for (int i = 0; i < len; i++) {// 0 1 2 3 4 
			System.out.println(scores[i]);//  scores[0]=89  scores[1]=98 scores[2]=80 scores[3]=78 scores[4]=92
		}

        

	}

}
