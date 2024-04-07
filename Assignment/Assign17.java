// palindrome

package mypackage;

import java.util.Scanner;

public class Assign17 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value");
		String palin= s1.next();
		String rev="";
		for(int i=(palin.length()-1); i>=0; i--)
		{
			 rev = rev + palin.charAt(i);
		}
System.out.println("result : " +rev );
s1.close();

	if(palin.equals(rev))
	{
		System.out.println("its palindrome");
	}
	else {
		System.out.println("its not palindrome");
		}
	}

}
