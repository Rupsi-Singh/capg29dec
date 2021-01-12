
public class MethodStackDemo {

	public static void main(String[] args) {
		System.out.println("--------Line First :  main---------");
		method1();
		System.out.println("--------Line Last :  main---------");

	}

	private static void method1() {
		System.out.println("--------Line First :  method1---------");
		try {
			method2();
		}catch (ArithmeticException e) {
			System.out.println("Problem is : "+e.getMessage());
		}
		System.out.println("--------Line Last :  method1---------");		
	}

	private static void method2() {
		System.out.println("--------Line First :  method2---------");
		int a,b,c;
		a=10;b=0;
		c=a/b;
		System.out.println("Result : "+c);
		System.out.println("--------Line Last :  method2---------");		
	}

}
