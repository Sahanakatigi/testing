package mypackage;
public class assign5 {  // constructor with multiple
	/*int id;
	char i;
	String name,address;
	boolean T,F;*/
	assign5(int a)
	{System.out.println("this is constructor 1 :" +a );
	}
	assign5(char c)
	{System.out.println("this is constructor 2 :" +'c');
	}
	assign5(String s)
	{System.out.println("this is constructor 3 :" +"s");
	}
	assign5(boolean b)
	{System.out.println("this is constructor 4 :" +b);
	}
	assign5(int a1,boolean b1,String c1)
	
	{System.out.println("this is constructor 5 :" +a1+" "+b1+" c1");
				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new assign5(5);
		new assign5('i');
		new assign5("hello");
		new assign5(true);
		new assign5(5,false,"hi");
		
		
		

	}

}
