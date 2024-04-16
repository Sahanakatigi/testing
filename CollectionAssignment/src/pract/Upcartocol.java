package pract;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Upcartocol {

	public static void main(String[] args) {
Collection c1=new ArrayList();
c1.add(100);
c1.add(100);//alows duplicate
c1.add(500);//follow indexing
c1.add(-88);
c1.add(null);
c1.add(null);//allow null
c1.add("arrycollec");//is hetrogenious
c1.add('a');
c1.add(100);
c1.add(100);//alows duplicate
c1.add(500);//follow indexing
c1.add(-88);
c1.add(null);
c1.add(null);//allow null
c1.add("arrycollec");//is hetrogenious
c1.add('a');// dynamic


System.out.println(c1);

Collection c2=new ArrayList();
c2.add(10);
c2.add(-1);
c2.add(100);
c2.addAll(c1);

//Collections.sort(c2);//not allowed
System.out.println(c2);



	}

}
