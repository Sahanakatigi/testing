////Q1)Check if given String only consist of digit

package mypackage;

import java.util.Arrays;

public class Assign21b {

	public static void main(String[] args) {
String d1="1123";
int count=0;
char d2[]=d1.toCharArray();
System.out.println(Arrays.toString(d2));
for(int i=0;i<d1.length();i++)
{
boolean ds=Character.isDigit(d2[i])	;
System.out.println(ds);

if(ds==true)
{
	count++;
	}}
System.out.println("output : " +count);
if(d1.length()==count)
{
	System.out.println("String has only digit");}
else{
	System.out.println("sorry");
}

	}
	
}
