//Properties of treeset and Iterator and ListIterator present
//as its set Listiterator not applicablre
package pract;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetinh {

	public static void main(String[] args) {

TreeSet t1=new TreeSet();
t1.add(100);//doesnot accept duplicate
t1.add(500);//does sorting
t1.add(0);//donot follow indexing
t1.add(-1);//not insertion
t1.add(100);//not dynamic
t1.add(1000);
t1.add(5);
t1.add(600);//hashcode
//t1.add(null);//not dynamic and not accept null
//t1.add("tree");//not hetrogeneous 
//t1.add('t');//do not allow string and char

System.out.println(t1);


Iterator i20=t1.iterator();
/*while(i20.hasNext()==true)
{
	System.out.println(i20.next());
	}*/
System.out.println("************************************");

}

}
