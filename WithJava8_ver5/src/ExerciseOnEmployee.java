import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExerciseOnEmployee {
	
	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee("pankaj", "sharma", 400000),
				new Employee("aman", "sony", 20000),
				new Employee("suman", "arya", 50000),
				new Employee("bijoy", "thapa", 70000),
				new Employee("anuj", "rathore", 50000)
				);
		
		//1. sort the names by first name
		Collections.sort(employees,( e1,  e2)-> e1.getFirstName().compareTo(e2.getFirstName()));		
		//2. create a method to display all sorted names		
		System.out.println("-----------------Sorted Employees------------------------");
		employees.stream().forEach(e->System.out.println(e));
		//3. create a method to display all sorted names startig with "a" letter
		System.out.println("----------sorted Employees First Name started with a----------");
		employees.stream().filter(e->e.getFirstName().startsWith("a")).forEach(e->System.out.println(e.getFirstName()));				
	}
	
}