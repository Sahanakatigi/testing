/*Area of Circle with human input at the Run time for 10 times*/

package mypackage;
import java.util.Scanner;

public class Assign13 {
	Scanner s1=new Scanner(System.in);
	double pie=3.14;
	public static void main(String[] args)
	{
		Assign13 v1 = new Assign13();
		v1.fa();
	}
	void fa(){ 
		for(int i=1;i<=10;i++)
		{


			int r1= s1.nextInt();
			int r2= s1.nextInt();
			double r3=pie*r1*r2;
			System.out.println("area : "  + r3);

		} 
	}
}		






