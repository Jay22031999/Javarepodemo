import java.util.*;
public class ComapreToLine{
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
    Double a = length1;
	Double b = length2;
	
	int compareValue = a.compareTo(b);
	
	if (compareValue == 0){
	System.out.println("Lengths are equal");
	}
	else if(compareValue < 0)
	{
	System.out.println("Length2 is Gretaer than Length1");
	} else{
	System.out.println("Length1 is Greater than Length2");
	}
}
}
	