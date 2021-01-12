
public class ExcDemo01 {

	public static void main(String[] args) {
		System.out.println("-------First Line----------");
		int a,b,c;
		a=10;
		b=2;
		try {
			c=a/b;
			System.out.println("Result : "+c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-------Last Line----------");

	}

}
