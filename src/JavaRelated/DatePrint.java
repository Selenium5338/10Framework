package JavaRelated;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePrint {
	public static void main(String[]args){
		System.out.println(getDateFromToday(6));
	}
	
	public static void currentDate(){
		//Intantiate a Date object
		Date date = new Date();
				
		//Display time and date using toString
		System.out.println(date.toString());
	}
	
	public static String getDateFromToday(int days){
		DateFormat dateFormat = new SimpleDateFormat("dd_mm_yyyy");
		//get current date time with Calender()
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		return dateFormat.format(cal.getTime());
	}
}
