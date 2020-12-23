package regexassign;

public class DriversLicense {
	public static void main(String[] args) {
		String dl = "123 456 789"; //Driver's License number with spaces
		
		if(dl.matches("[0-9]{3} [0-9]{3} [0-9]{3}")) {
			System.out.println("Driver's License id: " + dl);
		}
		else {
			System.out.println("Format not correct, please write in \\\"000 000 000\\\" (including the spaces)");
		}
	}
}
//task2 - write a program to validate a driver’s license