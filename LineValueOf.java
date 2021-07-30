import java.util.*;
public class LineValueOf{
  public static void main(String[] args){
	  int x1 = 4;
  int x2 = 7;
  int y1 = 10;
  int y2 = 17;
double length1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

   int a1 = 8;
   int b1 = 9;
   
   int a2 = 10;
   int b2 = 13;
   
   double length2 = Math.sqrt((Math.pow((a2 - a1),2)+Math.pow((b2-b1),2)));
  
   String s1 = String.valueOf(length1);
   String s2 = String.valueOf(length2);
   
   
   if(s1.equals(s2)){
	   System.out.println("Both are equals");
   }else{
	   System.out.println("Both Are Not Equal");
   }
  }
}