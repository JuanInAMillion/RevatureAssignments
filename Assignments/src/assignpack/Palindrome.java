package assignpack;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter a word");
	    String word = scanner.nextLine(); //take input and assign it to a variable
	    
		Palindrome p = new Palindrome();
		
		if (p.isPalindrome(word) == false) {
			System.out.println(word + " is not a palindrome.");
		} 
		else if(p.isPalindrome(word) == true) {
			System.out.println(word + " is a palindrome.");
		}
		}
	
	public boolean isPalindrome(String str) 
    {  
        int i = 0;
        int j = str.length() - 1; 
   
        while (i < j) { 
  
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }
            
            i++; 
            j--; 
        } 
        return true; 
    } 
}
//Create a class with a method which checks if the given value is palindrome or not
