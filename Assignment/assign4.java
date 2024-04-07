package mypackage;

public class assign4 {
	
	 public static void addition()//static
	 {
		int a1=200;
		int b1=300;
		int sum=a1+b1;
		System.out.println("output : " + sum);//static
		System.out.println("static in class n call in main method");
		
	}
	 public static void subraction()
	 {int a1=400;
	 int b1=300;
	 int sub=a1-b1;
	 System.out.println("output : " + sub);
		 
	 }

public static void multiply()
{
float a1=400.0f;
int b1=300;
float multipli=a1*b1;
System.out.println("output : " + multipli);
	 
}

public static void division()
{int a1=400;
int b1=200;
int div=a1/b1;
System.out.println("output : " + div);
	 
}

public static void modulus()
{int a1=400;
int b1=200;
int mod=a1%b1;
System.out.println("output : " + mod);
	 
}
	 
	 
	 void modulus1() // non-static
	 {
		 int a=20;
		 int b=10;
		 int c=a%b;
		 System.out.println("result :" +c);
	 }
	   void subraction1()
	 {int a1=400;
	 int b1=300;
	 int sub=a1-b1;
	 System.out.println("result : " + sub);
		 
	 }

public  void multiply1()
{
float a1=400.0f;
int b1=300;
float multipli=a1*b1;
System.out.println("result : " + multipli);
	 
}

public  void division1()
{int a1=400;
int b1=200;
int div=a1/b1;
System.out.println("result : " + div);
	 
}
public  void addition1()
{int a1=400;
int b1=200;
int div=a1+b1;
System.out.println("result : " + div);
	 
}

	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	addition();//call static method in main
	subraction();
	multiply();
	division();
	modulus();
	
	
	assign4 m1=new assign4(); //call non-static method in main
	m1.modulus1();
	m1.subraction1();
	m1.multiply1();
	m1.division1();
	m1.addition1();
	
}

}
