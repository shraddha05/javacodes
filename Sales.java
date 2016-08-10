package sales;

import java.util.Scanner;

public class Sales {

	public static void main(String[]args){
		 Scanner inp = new Scanner(System.in);
		 int []count=new int[10];
		 int n,i;
		 System.out.println("number of sales persons ?");

		 n=inp.nextInt();
		 System.out.println(" please enter salary of each person one by one");
		 int []salary=new int[n];
		 double []grossSales =new double[n];
		 for(i=0;i<n;i++){
		 grossSales[i]=inp.nextDouble();
		 salary[i]=200+(int)((5*grossSales[i])/100);
		 if(salary[i]>=200 && salary[i]<=299)count[1]++;
		 else if(salary[i]>=300 && salary[i]<=399)count[2]++;
		 else if(salary[i]>=400 && salary[i]<=499)count[3]++;
		 else if(salary[i]>=500 && salary[i]<=599)count[4]++;
		 else if(salary[i]>=600 && salary[i]<=699)count[5]++;
		 else if(salary[i]>=700 && salary[i]<=799)count[6]++;
		 else if(salary[i]>=800 && salary[i]<=899)count[7]++;
		 else if(salary[i]>=900 && salary[i]<=999)count[8]++;
		 else if(salary[i]>=1000)count[9]++;
		 }
		 System.out.println("employees in the ranges are displayed as follows: ");
		 System.out.println("range         -      no.of emp in the range ");
		 for(i=2;i<=10;i++){
		 int x,y;
		 x=i*100;
		 y=x+99;
		 if(i!=10){
		 System.out.println("$"+x+" - $"+y+"    - "+count[i-1]);
		 }
		 else{
		 System.out.println("$1000 and above     - "+count[i-1]);     
		 }
		 }
		 }


}
