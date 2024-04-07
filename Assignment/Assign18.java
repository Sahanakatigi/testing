package mypackage;

import java.util.Date;

public class Assign18 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//machine time
		Date d2=new Date(d1.getTime());//human time
		System.out.println(d2);
		Date d3=new Date(d2.getTime()+(1000*60*60*24*10));//future time in 10days
		System.out.println(d3);
		

	}

}
