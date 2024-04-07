/*Execute the Scanner class with all the methods 
using Global Variables */
package mypackage;
//import java.util.*;
import java.util.Scanner;
//global with scanner
public class Assign8 {
	Scanner sc = new Scanner(System.in);//scanner
	int  a = sc.nextInt();
	int  b = sc.nextInt();

	//System.out.println("enter a");

	//System.out.println("enter b");


	public  void add() {

		int c=a+b;
		System.err.println("This is addtion "+c);
	}
	public  void sub() {
		int c=a-b;
		System.err.println("This is subraction "+c);
	}
	public  void mul() {
		int c=a*b;
		System.err.println("This is multiplication "+c);
	}
	public  void div() {
		int c=a/b;
		System.err.println("This is division "+c);
	}
	
	public static void main(String[] args) {	
		Assign8 a8 = new Assign8();
		a8.add();
		a8.sub();
		a8.mul();
		a8.div();
		//System.out.println("local");
		a8.add1();
		a8.sub1();
		a8.mul1();
		a8.div1();

	}	
	//local variable
	public  void add1() {
		Scanner sc1 = new Scanner(System.in);
		int a1 = sc1.nextInt();
		int b1 = sc1.nextInt();
		int c1=a1+b1;
		System.err.println("This is addition " +c1);

	}
	public  void sub1() {
		Scanner sc2=new Scanner(System.in);
		int a2=sc2.nextInt();
		int b2=sc2.nextInt();
		int c2=a2-b2;
		System.err.println("This is subraction "+c2);

	}
	public  void mul1() {
		Scanner sc3=new Scanner(System.in);
		int a3=sc3.nextInt();
		int b3=sc3.nextInt();
		int c3=a3*b3;
		System.err.println("This is multiplication "+c3);
	}
	public  void div1() {
		Scanner sc4=new Scanner(System.in);
		int a4=sc4.nextInt();
		int b4=sc4.nextInt();
		int c4=a4/b4;
		System.err.println("This is division "+c4);

	}
}
