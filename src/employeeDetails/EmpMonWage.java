package employeeDetails;

public class EmpMonWage implements IWageCalculation{
	public int wageOfEmp(int day, int wage, int hours) {
        int monthlyWage = day * wage * hours;
        System.out.println("Monthly wage of employee is " + monthlyWage);
        return monthlyWage;
    }


}
