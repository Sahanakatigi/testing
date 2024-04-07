//From 1 to 100, print Even and Odd numbers//
package mypackage;

public class Assign12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eo();
	}
	static void eo(){
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{System.out.println("even number : "  +i);
			}
			else {
				System.out.println("odd number : "  +i);
			}
		}
	}

}
