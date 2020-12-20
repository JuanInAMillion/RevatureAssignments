package passport;

public class Validation {
	public boolean isValid(String passNum) throws InvalidException{
		//using regex to determine if passNum has 1 capital letter and 8 numbers
		if (!passNum.matches("[A-Z]{1}[0-9]{8}")) { 	
			throw new InvalidException("Passport Number Is NOT Valid, Please type in this format: A00000000");
		}
	
		return true;
	}
}
