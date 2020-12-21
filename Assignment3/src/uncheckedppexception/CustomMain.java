package uncheckedppexception;

public class CustomMain {
	public static void main(String[] args) {
		
		Validation v = new Validation();			

		try {
			if(v.isValid("C00002951")) {
				System.out.println("Passport Number IS Valid"); //Print out a message validated message
			}
			}
			catch(InvalidPPException e) {
				System.out.println(e.getMessage()); //error message
		}
	}
}
//Create a Custom Unchecked exception for checking if the entered Passport number is valid or not