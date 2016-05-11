package JavaRelated;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateUniqueEmail {
	public static String emailGenerationRandom(String emailTOCustome, String emailDomainName){
		DateFormat dateFormat = new SimpleDateFormat("dd_yyyy_HHmmss");
		
		//get cureent date time with 
		Date date =  new Date();
		String date1 = dateFormat.format(date);
		String email1 = emailTOCustome+date1+emailDomainName;
		System.out.println("New Email Generated  - - "+ email1);
		return email1;
		
	}
	
	public static void main(String[]args){
		System.out.println(emailGenerationRandom("anileshpriyadarhi", "@live.com"));
	}
}
