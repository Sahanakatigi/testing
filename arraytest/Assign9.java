// 2.two array are equal 
package arraytest;

import java.util.Arrays;

public class Assign9 {

	public static void main(String[] args) {
char value3[]=new char[2];
char value4[]=new char[2];
value3[0]=5;
value3[1]=6;

value4[0]=8;
value4[1]=5;

boolean bst1=Arrays.equals(value3, value4);
System.out.println(bst1);




		
	}

}
