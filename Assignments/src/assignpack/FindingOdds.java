package assignpack;

public class FindingOdds {
	public static void main(String[] args) {
		FindingOdds fo = new FindingOdds(); //creating an object
		fo.odds();
	}
	
	//looping between one and 100 and printing out every odd number
	public void odds() {
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 1) {
				System.out.print(" " + i);
			}
		}
	}
}
//Create a class with a method which generates odd numbers between the range.