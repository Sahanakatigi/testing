/* Find the Circumference of the Circle having 'pi' as static, final and Global and r via 
 * Scanner class   */
package mypackage;
import java.util.Scanner;

public class Assign10_Coc {
	
	final static double pie=3.14;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coc();
	}
		public static void coc() {
			Scanner s1=new Scanner(System.in);
			int r=s1.nextInt();
			double c=2*pie*r;
			System.err.println("Circumference : " +c);
		
		
		

	}

}
