package javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {
	public static void main(String[] args) {
		//Placed every problem into separate static methods and called them here in main
		deleteElement();
		findingEvenOdd();
		findingMinMax();
		findingPalindrome();
		findingSum();
		reverseArray();
		
	}
	public static void deleteElement() {
		System.out.println("1-Delete specific element from an array");
		ArrayList<String> name = new ArrayList<>(); 
		
		//add items into name array
		name.addAll(Arrays.asList("Juan", "Jissela", "Fabidaly", "Ramon", "Felix", "Angel", "Winnifer"));
		
		//print array before deletion
		System.out.print("Array before deletion: ");
		System.out.print(name);
		System.out.println("");
		
		System.out.print("Array after deletion: ");
		name.remove(3); // remove item at index 3
		System.out.print(name);
		System.out.println("");
		System.out.println("");
	}
	
	public static void findingEvenOdd() {
		System.out.println("2-Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array");
		
		ArrayList <Integer> numArray = new ArrayList<>();
		
		numArray.addAll(Arrays.asList(14, 4, 6, 11, 20, 21, 12, 8, 29, 27, 66, 63, 65, 70, 51, 15, 7, 1, 10, 3, 17, 54));
		int evenCount = 0; 
		int oddCount = 0; 
		
		
		for(int i = 0; i < numArray.size(); i++) {
			if(numArray.get(i)%2 == 0) {
				evenCount++; 
			} else {
				oddCount++;
			}
		}
		
		//Created two arrays with size determined by counting through numArray
		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];
		
		for(int i = 0, j = 0, k = 0; i < numArray.size();i++) {
			if(numArray.get(i)%2 == 0) {
				even[j] = numArray.get(i);
				j++;
			} else {
				odd[k] = numArray.get(i);
				k++;
			}	
		}
		
		System.out.print("Even: ");
		for(int i = 0; i < even.length; i++ ) {
			System.out.print(even[i] + " ");
		}
		System.out.println("");
		
		System.out.print("Odd: ");
		for(int i = 0; i < odd.length; i++ ) {
			System.out.print(odd[i] + " ");
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static void findingMinMax() {
		ArrayList<Integer> numArray = new ArrayList<>(); 
		System.out.println("3-Find the minimum and the maxim element in an array");
		
		numArray.addAll(Arrays.asList(14, 4, 6, 11, 20, 21, 12, 8, 29, 27, 66, 63, 65, 70, 51, 15, 7, 1, 10, 3, 17));
		
		int min;
		int max;
		
		System.out.print("Array before it is sorted: "); // print the array
		System.out.print(numArray);
		System.out.println("");
		
		Collections.sort(numArray);//sort the array
		System.out.print("Array after it is sorted: "); // after it sorted 
		System.out.print(numArray);
		System.out.println("");
		
		min = numArray.get(0); //assign the first index of the sorted array
		max = numArray.get(numArray.size() - 1); // assign the last index of the sorted array
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("");
	}
	
	public static void findingPalindrome() {
		System.out.println("4-Find all palindrome numbers in an array");
		ArrayList<Integer> numArray = new ArrayList<>();
		numArray.addAll(Arrays.asList(13, 11, 20, 101, 12, 8, 99, 27, 22, 353, 65, 70, 66, 15, 7, 2002, 10, 17));
		
		String str;
		
		System.out.print("Palindromes in the array: ");
		for (int i = 0; i < numArray.size(); i++) {
			
			int num=numArray.get(i);
			str = num + "";
			
			if(new StringBuffer(str).reverse().toString().equals(str)) {
				System.out.print(numArray.get(i) + " ");
			}
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static void findingSum() {
		System.out.println("5-Find the sum of all even and odd numbers separately and print the max out of it. (Max of sum of even vs odd)");
		ArrayList<Integer> numArray = new ArrayList<>();
		numArray.addAll(Arrays.asList(13, 4, 6, 11, 20, 101, 12, 8, 99, 27, 22, 353, 65, 70, 66, 15, 7, 202, 10, 3, 17));
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i = 0; i < numArray.size(); i++) {
			if(numArray.get(i)%2 == 0) {
				sumEven = sumEven + numArray.get(i);
			} 
			else {
				sumOdd = sumOdd + numArray.get(i);
			}
		}
		//print the sum of even and odd indexes
		System.out.println("Sum of even items: " + sumEven);
		System.out.println("Sum of odd item: " + sumOdd);
		
		if(sumEven > sumOdd) {
			System.out.println("The sum of even items is bigger, it is: " + sumEven);
		}
		else {
			System.out.println("The sum of odd items is bigger, it is: " + sumOdd);
		}
		System.out.println("");
	}
	
	public static void reverseArray() {
		System.out.println("6-Print the array in reverse order");
		ArrayList<Integer> numArray = new ArrayList<>();
		numArray.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
			
		//print array inorder
		System.out.print(numArray);	
		System.out.println("");//spacing
		
		Collections.sort(numArray, Collections.reverseOrder()); // reverse the order of arraylist.
		
		//print array after the order has been reversed.	
		System.out.print(numArray);
		
	}
}
