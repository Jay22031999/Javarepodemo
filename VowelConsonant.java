import java.util.*;
public class VowelConsonant{

    public static void main(String[] args) {
		System.out.println("enter a alphabet");
    Scanner sc = new Scanner(System.in); 
	String s1 = sc.nextLine();

        switch (s1) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(s1 + " is vowel");
                break;
            default:
                System.out.println(s1 + " is consonant");
        
        }
    }
}