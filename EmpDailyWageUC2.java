public class EmpDailyWageUC2{
  public static void main(String[] args){
	  //Constants
	int IS_FULL_TIME = 1;  
    int Wage_Page_Hour= 20;
	//Variables
	int empHrs = 0;
	int empWage = 0;
	//Computation
	double empCheck = Math.floor(Math.random() * 10) % 2;
	 if (empCheck == IS_FULL_TIME)
		 empHrs = 8;
	 else 
		 empHrs = 0;
	 empWage = empHrs * Wage_Page_Hour;
	 System.out.println("Emp Wage: " +empWage);
  }
}