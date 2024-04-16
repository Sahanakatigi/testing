package pract;

public class Constructor1 {
	Constructor1(){
		int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));

        }
	}

	public static void main(String[] args) {
		Constructor1 c1= new Constructor1();
	


	}

}
