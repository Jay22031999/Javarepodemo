import java.util.Scanner;  
public class LargestNumber  
{  
public static void main(String[] args)   
{  
int a, b, c, largest, temp;  
Scanner sc = new Scanner(System.in);   
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt(); 
//variable = (expression) ? expressionIsTrue : expressionIsFalse;
//expression is the expression the operator should evaluate
//expressionIsTrue is the value assigned to variable if the expression is true
//expressionIsFalse is the value assigned to variable if the expression is false
temp=a>b?a:b;   
largest=c>temp?c:temp;   
System.out.println("The largest number is: "+largest);  
} 
}  