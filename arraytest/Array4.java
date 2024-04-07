//check if string is digit 

package arraytest;
import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		boolean b1;
String s9="sahana123";
char value9[]=s9.toCharArray();
System.out.println(Arrays.toString(value9));
for(int i=0;i<s9.length();i++)
{
 b1=	Character.isDigit(value9[i]);// isalphabet to check alphabet,isspacechar for number of space
System.out.println(b1);
if(b1==true)
{
	System.out.println("string is digit at index : "  +i );
	}

/*else {
	System.out.println("sorry");

}*/

}


}

}
