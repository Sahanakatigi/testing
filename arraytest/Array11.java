//check 2 numbers are anagram to each other

package arraytest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
String name1="horse";
String name2="shore";

char c1[]=name1.toCharArray();//convert to chararray
char c2[]=name2.toCharArray();
System.out.println(Arrays.toString(c1));//declare
System.out.println(Arrays.toString(c2));//declare

Arrays.sort(c1);
System.out.println(Arrays.toString(c1));//after sort 

Arrays.sort(c2);
System.out.println(Arrays.toString(c2));//after sort 

boolean ba= Arrays.equals(c1, c2);
System.out.println(ba);
  if(ba==true)
  {
	  System.out.println("its anagram  ");
	 }
  else {
	  System.out.println("its not anagram  ");
 
  }
	
}

}
