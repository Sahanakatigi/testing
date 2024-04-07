// 1.two array are equal 

package arraytest;

import java.util.Arrays;

public class assign8 {

	public static void main(String[] args) {
String st1="Hello";

String st2="Hello";
char vst1[]= st1.toCharArray();
System.out.println(Arrays.toString(vst1));

char vst2[]= st1.toCharArray();
System.out.println(Arrays.toString(vst2));
boolean bst= Arrays.equals(vst1, vst2);
System.out.println(bst);


	}

}
