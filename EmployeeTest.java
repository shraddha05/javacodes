package emp;

import java.util.*;

	public class EmployeeTest {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			String fn,ln;
			double sal;
			Scanner inp = new Scanner(System.in);
			System.out.println("Enter the first name,last name and salary.");
			fn=inp.next();
			ln=inp.next();
			sal=inp.nextDouble();
			Employee a = new Employee(fn,ln,sal);
			a.displayYearlySalary();
			a.displayYearlySalaryIncrease();
		}

	}

