import java.util.*;
class Fibonacci{  
public static void main(String args[])  
{    
 int n3,i,count=10; 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the First Two Numbers");
 int n1 = sc.nextInt();
 int n2 = sc.nextInt();
System.out.print(n1+" "+n2);   
//loop starts from 2 because 0 and 1 are already printed  
 for(i=2;i<count;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
}}  