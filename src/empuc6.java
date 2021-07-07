
public class empuc6 {
	
	public static void main(String[] args) {
		
		int EMP_RATE_PER_HOUR = 20;
        int NUM_OF_WORKING_DAYS = 20;
        int MAX_HRS_IN_MONTH = 100;
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
            //Computation
            while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
            {
                totalWorkingDays++;
                int empCheck = ((int)(Math.random() * 10));
                switch (empCheck)
                {
                    case 0:
                        empHrs = 4;
                        break;
                    case 1:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                        break;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day#:" + totalWorkingDays + "Emp Hours : " + empHrs);
                int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
                System.out.println("Total Emp Wage : " + totalEmpWage);
        }
	}
}
