////in given string calculate number of alphabets values
package arraytest;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
 int spacecount=0;
		String s5="check for space ";
		char spa[]=s5.toCharArray();
		System.out.println(Arrays.toString(spa));
		for (int i=0;i<s5.length();i++)
		{
			boolean bs=Character.isSpaceChar(spa[i]);
			System.out.println(bs);
			if(bs==true)
			{
				spacecount++;
			}
		}
		System.out.println("space count :" +spacecount);
	}

}
