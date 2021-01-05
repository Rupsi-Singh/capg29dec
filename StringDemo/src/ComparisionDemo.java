
public class ComparisionDemo {

	public static void main(String[] args) {
		String str1=new String("Hello"); 
		String str2=new String("Hello"); 
		
		if(str1==str2) {
			System.out.println("Both are equal");
		}
		if(str1.equals(str2)) {
			System.out.println("Value inside both objects are same");
		}

	}

}
