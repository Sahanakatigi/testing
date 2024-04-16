//inherit linked lisy or //Properties of LinkedList


package pract;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
LinkedList l2=new LinkedList();

l2.add(12);//follow indexing
l2.add(12);//is hetro and accept duplicate
l2.add(null);//accept null
l2.add("linklist");
l2.add('l');
l2.add(7);
l2.add(-144);
System.out.println(l2);

LinkedList l3=new LinkedList();//doesnot sorting 
l3.add(7);
l3.add(-144);
l3.add(0);
l3.add(100);
l3.add(99);
l3.add(3);
System.out.println(l3);
	}

}
