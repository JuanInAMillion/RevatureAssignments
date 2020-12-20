package driverslicense;

public class Validation {
	public boolean isValid(String dlNum) throws InvalidException{
		//using regex to determine if dlNum has 9 numbers with spacing between every 3 numbers
		if (!dlNum.matches("[0-9]{3} [0-9]{3} [0-9]{3}")) { 	
			throw new InvalidException("Driver's License Number Is NOT Valid, Please type in this format: 000 000 000 (including spaces)");
		}
	
		return true;
	}
}
