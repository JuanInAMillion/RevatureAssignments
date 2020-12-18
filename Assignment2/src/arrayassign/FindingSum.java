package arrayassign;

public class FindingSum {
	public static void main(String[] args) {
		int[] numArray = {13, 4, 6, 11, 20, 101, 12, 8, 99, 27, 22, 353, 65, 70, 66, 15, 7, 202, 10, 3, 17};
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]%2 == 0) {
				sumEven = sumEven + numArray[i];
			} 
			else {
				sumOdd = sumOdd + numArray[i];
			}
		}
		//print the sum of even and odd indexes
		System.out.println("Sum of even items: " + sumEven);
		System.out.println("Sum of odd items: " + sumOdd);
		
		if(sumEven > sumOdd) {
			System.out.println("The sum of even items is bigger, it is: " + sumEven);
		}
		else {
			System.out.println("The sum of odd items is bigger, it is: " + sumOdd);
		}
	}
}
//Find the sum of all even and odd numbers separately and print the max out of it. 
//(Max of sum of even vs odd)