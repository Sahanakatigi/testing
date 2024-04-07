

package mypackage;
abstract class parent_Abstract1{
	
	abstract void phonepay();
	abstract void googlepay();
	static void razorpay() {
		int p=3;
		//string g="pay";
				System.out.println("concrete method" +p );
	}
	
	
}

abstract class parent_Abstract2 extends parent_Abstract1
{
	abstract void paytm();
	abstract void credit();
	static void debit() {
		int p1=30;
		//string g="pay";
				System.out.println("concrete method" +p1 );
	}
	}


public class Assign16 extends parent_Abstract2 {
	
	static void axis(){
		
	System.out.println("child concrete method1 ");
		
	}
	 void axis1(){
		
		System.out.println("child concrete method2 ");
			
		}

	public static void main(String[] args) {
		axis();
		Assign16 a1= new Assign16();
		a1.axis1();
		debit();
		razorpay();
		
		

	}

	@Override
	void paytm() {
		System.out.println("paytm");
		
	}

	@Override
	void credit() {
		System.out.println("credit");
		
	}

	@Override
	void phonepay() {
		System.out.println("phonepay");
		
	}

	@Override
	void googlepay() {
		System.out.println("googlepay");
		
	}

}
