//copy java program to copy an array by iterating ther array
package arraytest;

import java.util.Arrays;

public class Array14 {

	public static void main(String[] args) {

String s5="dcba";
String s6="";
char ca[]=s5.toCharArray();
char ca1[]=s6.toCharArray();

System.out.println(Arrays.toString(ca));
//System.out.println(Arrays.toString(ca1));

for(int i=0;i<s5.length();i++)
{
	ca1[i]=ca[i];
}
System.out.println(Arrays.toString(ca));
System.out.println(Arrays.toString(ca1));


	}

}
