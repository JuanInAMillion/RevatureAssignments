package regexassign;

public class SocialSecurity {
	public static void main(String[] args) {
		String ssn = "060-11-5555"; //social security with dashes 
		
		if(ssn.matches("[0-9]{3}\\-[0-9]{2}\\-[0-9]{4}")) {
			System.out.println("Your SSN: ###-##-" + ssn.substring(7,11));
		}
		else {
			System.out.println("Format not correct, please write as \"000-00-0000\" (including the dashes)");
		}
	}
}
//task1 - Write a program to validate an SSN number using regex