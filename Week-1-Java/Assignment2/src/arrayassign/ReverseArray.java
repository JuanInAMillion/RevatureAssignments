package arrayassign;

public class ReverseArray {
	public static void main(String[] args) {
		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8};
	
		//print array inorder
		for(int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		
		System.out.println("");//spacing
		
		//print array in reverse order
		for(int i = numArray.length - 1; i >=0; i--) {
			System.out.print(numArray[i] + " ");
		}
	}
}

//Print the array in reverse order