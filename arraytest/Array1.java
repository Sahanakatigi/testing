//array out of bound
package arraytest;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int age[]=new int[5];
		age[0]=5;
		age[1]=15;
		age[2]=25;
		age[3]=35;
		age[4]=45;
		//age[5]=55;
		
		//System.out.println(age[0]);
		//System.out.println(age[1]);
		//System.out.println(age[2]);
		//System.out.println(age[3]);
		//System.out.println(age[4]);
		    //or
		for (int i=0 ;i<5 ;i++)
		{
		System.out.println(age[i]);	
		}
		//or
		//System.out.println(Arrays.toString(age));
}
}
