package employeeDetails;

public class WageUsingSwitch extends EmpPresentOrAbsent implements ISolvingWithSwitch {
	static int dailyWage;
	   
    public int EmpUsingSwitchCase(int day, int wage) {

        switch (EmpPresentOrAbsent())
        {
            case 1:
                dailyWage = day*wage;
                System.out.println("Employee is present today \n His daily wage is :"+dailyWage);
                break;
            case 0:
                System.out.println("Employee is absent today \n His daily wage is : 0");
                dailyWage = 0;
                break;
        }
        return dailyWage;
    }

	
	public int wageWithSwitch(int day, int wage) {
		// TODO Auto-generated method stub
		return 0;
	}


}
