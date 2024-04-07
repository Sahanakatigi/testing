////in given string calculate number of alphabets values

package arraytest;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
   String sa="alpha34";
   int countalpha=0;
   char alpha[]=sa.toCharArray();
   System.out.println(Arrays.toString(alpha));
   for (int i=0;i<sa.length();i++)
   {
	   boolean b2=Character.isAlphabetic(alpha[i]);
	   System.out.println(b2);
	   if(b2==true)
			   {
		   countalpha++;
			   }
  }
   System.out.println("alphacount : " +countalpha);
	}

}
