package arrayassign;

public class FindingPalindrome {
	public static void main(String[] args) {
		int[] numArray = {13, 11, 20, 101, 12, 8, 99, 27, 22, 353, 65, 70, 66, 15, 7, 2002, 10, 17};
		String str;
		
		System.out.print("Palindromes in the array: ");
		for (int i = 0; i < numArray.length; i++) {
			
			int num=numArray[i];
			str = num + "";
			
			if(new StringBuffer(str).reverse().toString().equals(str)) {
				System.out.print(numArray[i] + " ");
			}
		}
		
	}
}
//Find all palindrome numbers in an array