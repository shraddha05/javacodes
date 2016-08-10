package emp;


public class Employee {
	private String firstN; 
    private String lastN; 
    private double monthlySalary;
 
    public Employee(String name, String name2, double salary) {
        firstN = name;
        lastN = name2;
        monthlySalary = salary;
    }
 
    public void setFirstN(String name) {
        firstN = name;
    }
 
    public String getFirstN() {
        return firstN;
    }
 
    public void setLastN(String name) {
        lastN = name;
    }
 
    public String getLastN() {
        return lastN;
    }
 
    public void setmonthlySalary(double salary) {
        monthlySalary = salary;
    }
 
    public double getmonthlySalary() {
        return monthlySalary;
    }
 
    public double yearlySalary() {
        double yearlySalary;
        yearlySalary = (monthlySalary * 12);
        return yearlySalary;
    }
 
    public double yearlySalaryIncrease() {
        double yearlySalaryIncrease;
        yearlySalaryIncrease = (((yearlySalary() * (0.1)) + yearlySalary()));
        return yearlySalaryIncrease;
    }

    public void displayYearlySalary() {
        System.out.println(firstN+" "+lastN+"'s Yearly Salary is $"+yearlySalary());
    }
 
    public void displayYearlySalaryIncrease() {
        System.out.println(firstN+" "+lastN+"'s Yearly Salary increase is $"+yearlySalaryIncrease());
    }

}


