package pract;

import java.util.ArrayList;

public class ArrayLMet {

	public static void main(String[] args) {
		ArrayList at1= new ArrayList();
		at1.add(100);
		at1.add(100);
		at1.add("Array");
		at1.add('a');
		System.out.println(at1);
		System.out.println(at1.isEmpty());
		System.out.println(at1.contains('a'));
		//at1.clear();
		System.out.println(at1.size());
		System.out.println("next***********8");
		//Methods
		ArrayList at2= new ArrayList();
		at2.addAll(at1);
		at2.add("check");
		at2.remove("check");
		System.out.println(at2);
		System.out.println(at2.containsAll(at1));
		
		
	
	}

}
