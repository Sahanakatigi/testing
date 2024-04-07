//Exception Handling Program using Array concept
package mypackage;

public class Assign23 {

	public static void main(String[] args) {
try{
	int a1[]=new int[4];

a1[0]=354;
a1[1]=354;
a1[2]=354;
a1[3]=354;
a1[4]=354;
}
catch(ArrayIndexOutOfBoundsException a2)
{
	System.out.println("handled exception");
	}
		
	}

}
