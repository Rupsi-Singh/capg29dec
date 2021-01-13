package second;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rishita", "Pranjali","Shriya","Bijoy","Aman");
		System.out.println("--------Before Sorting---------");
		System.out.println(names);
		Collections.sort(names);
		System.out.println("--------After Sorting---------");
		System.out.println(names);

	}

}
