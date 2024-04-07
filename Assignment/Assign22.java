package mypackage;

import java.util.Arrays;

public class Assign22 {

	public static void main(String[] args) {
	System.out.println("Roll No");	
int rollno[]=new int[5];
int size = rollno.length;
rollno[0]=1;
rollno[1]=2;
rollno[2]=3;
rollno[3]=4;
rollno[4]=5;
for (int i=0 ;i<5 ;i++)
{
System.out.println(rollno[i]);	
}
System.out.println(Arrays.toString(rollno));
System.out.println(rollno.length);




	}

}
