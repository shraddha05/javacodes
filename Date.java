package date;

public class Date {
	private int monthdate;
	private int daydate;
	private int yeardate;


	public Date(int m,int d,int y){
		monthdate=m;
		daydate=d;
		yeardate=y;
	}


		public int getMonth() {
		return monthdate;
	}


	public void setMonth(int m) {
		monthdate = m;
	}


	public int getDay() {
		return daydate;
	}


	public void setDay(int d) {
	   daydate = d;
	}


	public int getYear() {
		return yeardate;
	}


	public void setYear(int y) {
		yeardate = y;
	}

	public void displayDate (){
		System.out.println((int) getMonth()+"/"+(int) getDay()+"/"+(int)getYear());
	}

		


}
