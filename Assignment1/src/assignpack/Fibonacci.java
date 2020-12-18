package assignpack;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter a number");
	    int num = scanner.nextInt(); //take input and assign it to a variable
		
		Fibonacci f = new Fibonacci();	//creating an object to use with the method
        for (int i = 0; i < num; i++) { 
            System.out.print(f.fibSeq(i) + " ");  //pass the variable for fibSeq method
        } 		
	}
	
	public int fibSeq(int n) {    
	    if (n <= 1) 
	       return n; 
	    return fibSeq(n-1) + fibSeq(n-2);    
	}
}
//Create a class with method which generates fibonacci sequence