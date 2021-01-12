public class SOError {

	public static void main(String[] args) {
		System.out.println("-------First Line : Main--------");
		test();
		System.out.println("-------Last Line : Main--------");

	}

	private static void test() {
		System.out.println("-------First Line : test--------");
		test();
		System.out.println("-------Last Line : test--------");
		
	}

}
