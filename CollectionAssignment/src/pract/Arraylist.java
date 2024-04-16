//Inherit arraylist or properties of  ArrayList
package pract;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(100);
		a1.add(true);

		a1.add(13);
		a1.add(100);
		a1.add("sahana");
		a1.add('s');
		a1.add(null);
System.out.println(a1);
		
		
		
ArrayList a2=new ArrayList();
a2.add(13);
a2.add(100);
a2.add(-9);
a2.add(100);
a2.add(1000);
Collections.sort(a2);
System.out.println(a2);

	}

}
