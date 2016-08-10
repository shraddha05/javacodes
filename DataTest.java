package date;



import java.util.Scanner;

public class DataTest {
	 public static void main (String [] args) {
	    	Scanner  input = new Scanner (System.in);
	        Date display = new Date (0,0,0);

	         
	        int month;
	        int day;
	        int year;
	         
	        System.out.print ("Enter Month: "); 
	        month = input.nextInt();
	        display.setMonth(month);
	         
	        System.out.println ();
	         
	        System.out.print ("Enter Day: ");
	        day = input.nextInt();
	        display.setDay(day);
	         
	        System.out.println ();
	         
	        System.out.print ("Enter Year: ");
	        year = input.nextInt();
	        display.setYear(year);
	         
	        System.out.println ();
	         
	        display.displayDate();
	 
	    }

}
