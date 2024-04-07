//in given string calculate number of numeric values

package arraytest;
import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
int Countdigit=0;
//boolean b11;
		String s5="alpha12345";
char v7[]=s5.toCharArray();
System.out.println(Arrays.toString(v7));
for (int i=0;i<s5.length();i++)
{
	boolean b11=Character.isDigit(v7[i]);
	System.out.println(b11);
	if (b11==true)
		{
				Countdigit++;
}}

	System.out.println("digit are :" +Countdigit);
	}}





