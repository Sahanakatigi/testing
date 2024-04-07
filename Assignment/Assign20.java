//Q1)check in the given string how many Special characters are present

package mypackage;

import java.util.Arrays;

public class Assign20 {

	public static void main(String[] args) {
int countspl=0;
		String sc=" Check f@r %^& ** ";
		
char sc1[]=sc.toCharArray();
System.out.println((Arrays.toString(sc1)));
for (int i=0;i<sc.length();i++)//check alphabet
{
	boolean sa=Character.isAlphabetic(sc1[i]);
	System.out.println(sa);
	//}
for (int j=0;i<sc.length();j++)//check digit
{
	boolean sd=Character.isAlphabetic(sc1[j]);
	System.out.println(sd);
	//}
for (int k=0;i<sc.length();k++)//check space
{
	boolean ss=Character.isAlphabetic(sc1[k]);
	System.out.println(ss);
	//}
if(specialchar.length()!=((sa)-(sd)-(ss)))
{
	countspl++;
	}
System.out.println("spl cout: " +countspl);
	
}}}	

	}

}
