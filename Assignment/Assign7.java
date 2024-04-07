package mypackage;
import java.util.*;

public class Assign7 {
	
	public static int b=10; //global

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
	
			
		b=11; 
		Assign3.Add();
		System.out.println("enter number from keyboard");
		int a=s1.nextInt();
				//s1.close();
		System.out.println("received number from keyboard is " +a);
		 
			s1.close();
		

	}

}
