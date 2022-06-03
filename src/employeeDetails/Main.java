package employeeDetails;

import java.util.Scanner;

public class Main {
	static int days;
    static int hoursMonth;
    static int wagePerHour;
    static int hoursPerDay;
    static int wagePerHourPartTime;
    static int hoursPerDayPartTime;

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter company working days in a month ");
        days= sc.nextInt();

        System.out.println("Enter total hours per month ");
        hoursMonth= sc.nextInt();

        System.out.println("Enter company wage for one hour ");
         wagePerHour= sc.nextInt();

        System.out.println("Enter company working hours one day ");
        hoursPerDay= sc.nextInt();

        System.out.println("Enter company wage for one hour for a part time employee");
        wagePerHourPartTime= sc.nextInt();

        System.out.println("Enter company working hours one day for a part time employee ");
         hoursPerDayPartTime= sc.nextInt();


        System.out.println("Enter 1 to check the details of regular employee and enter 2 to check the details of part time/intern's details.");
        int option = sc.nextInt();

        IPresentOrAbsent c = new EmpPresentOrAbsent();
        System.out.println(((EmpPresentOrAbsent) c).presentOrAbsent());
        IWageCalculation wc = new EmpDailyWage();
       ISolvingWithSwitch solveWithSwitch = new WageUsingSwitch();
       EmpMonWage mw = new EmpMonWage();
        Condition cs = new Condition();
        if(option == 1)
        {
            wc.wageOfEmp(hoursPerDay,wagePerHour,hoursPerDay);
            System.out.println("----Solving with switch statement----");
            ISolvingWithSwitch.wageWithSwitch(hoursPerDay,wagePerHour);
           mw.wageOfEmp(days,wagePerHour,hoursPerDay);
           cs.condition(1);

        }
        else if(option == 2)
        {
            wc.wageOfEmp(hoursPerDayPartTime,wagePerHourPartTime,hoursPerDay);
            System.out.println("----Solving with switch statement----");
            ISolvingWithSwitch.wageWithSwitch(hoursPerDayPartTime,wagePerHourPartTime);
            mw.wageOfEmp(days,wagePerHourPartTime,hoursPerDayPartTime);
            cs.condition(2);

        }
    }
}

/*
 * interface IPresentOrAbsent { int presentOrAbsent();
 * 
 * }
 */
interface IWageCalculation
{
    int wageOfEmp(int day,int wage,int hours);
}

interface ISolvingWithSwitch
{
    static int wageWithSwitch(int day,int wage) {
		// TODO Auto-generated method stub
		return 0;
	}

}
