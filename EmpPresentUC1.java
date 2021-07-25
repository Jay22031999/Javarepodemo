public class EmpPresentUC1 {
 public static void main(String[] args){
   //Constants
   int IS_PRESENT = 1;
   //Computation
   double empcheck = Math.floor(Math.random() * 10) % 2;
   if (empcheck == IS_PRESENT)
    System.out.println("Employee is Present");
  else
	System.out.println("Employee is Absent");
 }
}