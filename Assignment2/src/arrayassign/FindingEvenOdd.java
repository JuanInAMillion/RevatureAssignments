package arrayassign;

public class FindingEvenOdd {
	public static void main(String[] args) {
		int[] numArray = {14, 4, 6, 11, 20, 21, 12, 8, 29, 27, 66, 63, 65, 70, 51, 15, 7, 1, 10, 3, 17, 54};
		int evenCount = 0; 
		int oddCount = 0; 
		
		//loop through numaArray and count number of even and odds 
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]%2 == 0) {
				evenCount++; 
			} else {
				oddCount++;
			}
		}
		
		//Created two arrays with size determined by counting through numArray
		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];
		
		for(int i = 0, j = 0, k = 0; i < numArray.length;i++) {
			if(numArray[i]%2 == 0) {
				even[j] = numArray[i];
				j++;
			} else {
				odd[k] = numArray[i];
				k++;
			}	
		}
		
		for(int i = 0; i < even.length; i++ ) {
			System.out.print(even[i] + " ");
		}
		System.out.println("");	
		System.out.println("");
		for(int i = 0; i < odd.length; i++ ) {
			System.out.print(odd[i] + " ");
		}
			
	}
}
//Find all the even numbers and put it in a new array 
//and also find all odd numbers and put it in another array