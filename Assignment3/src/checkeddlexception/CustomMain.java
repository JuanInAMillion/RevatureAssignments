package checkeddlexception;

public class CustomMain {
public static void main(String[] args) {
		
	Validation v = new Validation();			
	
	try {
		if(v.isValid("000 000 123")) {
				System.out.println("Driver's License Number IS Valid"); //Print out a message validated message
		}
		}
		catch(InvalidDLException e) {
			System.out.println(e.getMessage()); //error message
		}
	}
}
//Create a Custom Checked exception if the entered DL is valid or not.