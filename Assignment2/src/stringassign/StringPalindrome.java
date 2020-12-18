package stringassign;

import java.util.ArrayList;

public class StringPalindrome {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>(); //created a list to hold all values from 1000 to 9999
		String str;
		
		for(int i = 1000; i <= 9999; i++) { //loop from 1000 to 9999 and add the value into numList
			numList.add(i);
		}
		
		System.out.println("All palindromes between 1000 and 9999: ");
		for (int i = 0; i < numList.size(); i++) { 
			
			int num=numList.get(i);
			str = num + ""; //converts list items to string
			
			if(new StringBuffer(str).reverse().toString().equals(str)) {//compares the string by checking if they equal their value in reverse
				System.out.println(numList.get(i) + " ");
			}
		}
	}
}
//Task  - Print all palindromes between 1000 and 9999 with the above style