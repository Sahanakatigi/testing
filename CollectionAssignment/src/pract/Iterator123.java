//iterstor nd listiterator
package pract;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator123 {

	public static void main(String[] args) {

		
ArrayList ar1=new ArrayList();
ar1.add(100);
ar1.add(-300);
ar1.add(100);
ar1.add("hello");
ar1.add('h');

Iterator i1=ar1.iterator();//syntax Iterator for whole collection
/*while(i1.hasNext()==true)//check 1st element
{
	System.out.println(i1.next());
	}*/

ListIterator i2=ar1.listIterator();//for only list interface
while(i2.hasNext()==true)//check 1st element
{
	System.out.println(i2.next());
	}
System.out.println("**************");
while(i2.hasPrevious()==true)//reverse order
{
	System.out.println(i2.previous());
	}


	}

}
