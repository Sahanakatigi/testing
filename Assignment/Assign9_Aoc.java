/* Find the Area of the Circle having 'pi' 
 as static, final and Global with int radius and 
  double radius using Scanner class*/
package mypackage;
import java.util.Scanner;

public class Assign9_Aoc {
	 static Scanner sc=new Scanner(System.in);
	 final static double pie =3.14;
	 
	static void aoc(){
		int r= sc.nextInt();
		double r1=sc.nextDouble();
		double O=pie*r*r1;
		System.err.println("Area of cirles : " +O);
		
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aoc();
		

	}

}
