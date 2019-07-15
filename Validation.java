package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public boolean validateuserName(String userName)
	{
		Pattern pattern=Pattern.compile("[A-Za-z]{4,}");
		Matcher m=pattern.matcher(userName);
		return m.matches();
		
	}
	
	public boolean validateemailId(String emailId)
	{
		Pattern pattern=Pattern.compile("[A-Za-z]{4,}");
		Matcher m=pattern.matcher(emailId);
		return m.matches();
	}
	
	public boolean validatephoneNo(int phoneNo)
	{
		
		return false;
		
	}
}
