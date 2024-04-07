////copy java program to copy an array by iterating ther array and check if both are equal
package arraytest;

import java.util.Arrays;

public class Array15 {

	public static void main(String[] args) {

int v1[]=new int[3];
int v2[]=new int[3];
v1[0]=7;
v1[1]=8;
v1[2]=191;
System.out.println(Arrays.toString(v1));
for(int i=0;i<v1.length;i++)
{ v2[i]=v1[i];	
	}
	System.out.println("Original : " +Arrays.toString(v1));
	System.out.println("Copied : " +Arrays.toString(v2));
	boolean bst1=Arrays.equals(v1, v2);
	//System.out.println(bst1);
	if(bst1==true)
	{
		System.out.println("both are eual");
	}

	}}


