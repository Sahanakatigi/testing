//Q1)Check if given String only consist of alpha
package mypackage;

import java.util.Arrays;

public class Assign21a {

	public static void main(String[] args) {
int count=0;
		String s2="alpha";
char a1[]=s2.toCharArray();
System.out.println(Arrays.toString(a1));
for(int i=0;i<s2.length();i++)
{
	boolean ba=Character.isAlphabetic(a1[i]);
	System.out.println(ba);
		if(ba==true)
		{
			
	count++;
		}
}
System.out.println("result : " +count);

if(s2.length()==count)
{
	System.out.println("String has only alphabet");
	}
else {
	System.out.println("sorry");
}
	}

}
