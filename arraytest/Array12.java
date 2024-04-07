//average of numbers
package arraytest;
//import java.util.Arrays;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb[]=new int[5];
		numb[0]=13;
		numb[1]=14;
		numb[2]=15;
		numb[3]=18;
		numb[4]=10;
		
		int sum=0;
	
		for(int i=0; i<numb.length; i++)
		{
           sum=sum + numb[i];
}
System.out.println(sum);
double average=sum/numb.length;
System.out.println(average);
		
	}

}
