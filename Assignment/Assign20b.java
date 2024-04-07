//Q2)Create a Array of length 5 & int datatype & Store value in it using scanner class
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

public class Assign20b {

	public static void main(String[] args) {

Scanner as=new Scanner(System.in);
int size=as.nextInt();
int v1[]=new int[size];
Scanner s2= new Scanner(System.in);

System.out.println("enter ");
for(int i=0;i<v1.length;i++ )
{
	 v1 [i]=s2.nextInt();
}
System.out.println(Arrays.toString(v1));
s2.close();
}

}


