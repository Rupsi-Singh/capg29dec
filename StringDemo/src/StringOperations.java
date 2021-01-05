
public class StringOperations {

	public static void main(String[] args) {
		String str1=new String("Hello Friends");
		String copyrigt = "CopyRight | 2020";
		System.out.println("str1 = "+str1);
		System.out.println("charAt() : "+str1.charAt(6));
		System.out.println("endsWith : "+str1.endsWith("ends"));
		System.out.println("indexOf : "+str1.indexOf('F'));
		System.out.println("lastIndexOf : "+str1.lastIndexOf('e'));
		System.out.println("length : "+str1.length());
		System.out.println("replace : "+str1.replace('e', 'X'));
		System.out.println("CopyRight : "+copyrigt.replace("2020", "2021"));
		String [] tokens = str1.split(" ");
		System.out.println("split : ");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		System.out.println("startsWith : "+str1.startsWith("foo"));
		System.out.println("substring : "+str1.substring(6,9));
		System.out.println("toLowerCase : "+str1.toLowerCase());
		System.out.println("toUpperCase : "+str1.toUpperCase());

	}

}
