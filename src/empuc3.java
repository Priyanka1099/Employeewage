
public class empuc3 {
	
	 public static void main(String[] args) {
     
         //Constants
         int IS_PART_TIME = 1;
         int IS_FULL_TIME = 2;
         int EMP_RATE_PER_HOUR = 20;
         //Variables
         int empHrs = 0;
         int empWage = 0;
         int empCheck = ((int)(Math.random() * 10));
         //Computation
         if (empCheck == IS_PART_TIME)
         {
             empHrs = 8;
         }
         else if (empCheck == IS_FULL_TIME)
         {
             empHrs = 12;
         }
         else
         {
             empHrs = 0;

         }
         empWage = empHrs * EMP_RATE_PER_HOUR;
         System.out.println("Employee Wage : " + empWage);
     }
 
	}
