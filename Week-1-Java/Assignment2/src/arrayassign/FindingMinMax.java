package arrayassign;

import java.util.Arrays;

public class FindingMinMax {
	public static void main(String[] args) {
		int[] numArray = {14, 4, 6, 11, 20, 21, 12, 8, 29, 27, 66, 63, 65, 70, 51, 15, 7, 1, 10, 3, 17};
		int min;
		int max;
		
		System.out.println("Array before it is sorted: " + Arrays.toString(numArray)); // print the array
		
		Arrays.sort(numArray);//sort the array
		System.out.println("Array after it is sorted: " + Arrays.toString(numArray)); // after it sorted
		
		min = numArray[0]; //assign the first index of the sorted array
		max = numArray[numArray.length - 1]; // assign the last index of the sorted array
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
			
	}
}
//Find the minimum and the maxim element in an array