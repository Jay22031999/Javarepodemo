public class HeadAndTails{
 public static void main(String[] args)
 {
	int Heads = 0;
    int Tails = 0;
 for(int i =1;i<=20;i++){
 int flipCheck = (int)Math.floor(Math.random() * 10)% 2;
 System.out.println("flipCheck::::::"+ flipCheck);
 if(flipCheck < 0.5){
 System.out.println("Heads");
 Heads= Heads+ i;
 System.out.println("Total count of Head:::"+Heads);
 }
 else{
 System.out.println("Tails");
  Tails=Tails+i;
System.out.println("Total count of Tails:::"+Tails);
 }
 }
}