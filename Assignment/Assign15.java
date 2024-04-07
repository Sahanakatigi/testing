package mypackage;
import java.util.Scanner;


public class Assign15 {

	public static void main(String[] args) {
		
		System.out.println("enter the case");
		
		Scanner s1= new Scanner(System.in);
		int i=s1.nextInt();
		s1.close();
		
		switch(i) {
		
		case 1 : System.out.println("one");
		case 2 : System.out.println("two");
		case 3 : System.out.println("three");
		case 4 : System.out.println("four");
		case 5 : System.out.println("five");
		default : System.out.println("nothing");
	}
	}}
