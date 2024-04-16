//upcasting arraylist to list nd getting bhaviour oflist interface

package pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collection1 {

	public static void main(String[] args) {
List l1=new ArrayList();
l1.add(17);//duplicate
//l1.add(null);//dynamic nd hetrogeneous
l1.add(17);//order of insertion
//l1.add(null);//allow multiple null
l1.add(500);
l1.add(-677);
Collections.sort(l1);
System.out.println(l1);

	}

}
