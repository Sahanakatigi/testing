//Array of length 4 nd  check given numbr 6 is present in array or not
package arraytest;

public class Array13 {

	public static void main(String[] args) {
int c1[]=new int[4];
c1[0]=7;
c1[1]=215;
c1[2]=6;
c1[3]=8;
int check=6;
for (int i=0;i<c1.length;i++)
{
System.out.println(c1[i]);	
if(c1[i]==check)
{
	System.out.println("found number " +check+"at index  "  + i);
	}
else {
	System.out.println("not found number " +check+  "at index  "  + i );
}
}
 

	}

}
