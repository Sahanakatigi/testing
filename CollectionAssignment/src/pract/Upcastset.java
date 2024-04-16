//behaviour of set interface 
package pract;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


public class Upcastset {

	public static void main(String[] args) {
Set s1=new TreeSet();//follow hashcode
s1.add(100);//no indexing followed
s1.add(-300);
s1.add(100);//duplicate no allowed
s1.add(500);//no indexing followed
s1.add(10000);
s1.add(1313);
//s1.add(null);//not accepted

//s1.add("string");//not hetrogeneous
//ss1.add('s');
//s1.add(null);
Collections.sort(s1);
System.out.println(s1);





}

}
