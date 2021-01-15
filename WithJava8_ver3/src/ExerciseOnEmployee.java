import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getFirstName().compareTo(e2.getFirstName());
			}
		});
		
		//2. create a method to display all sorted names		
		System.out.println("-----------------Sorted Employees------------------------");
		printAllEmployees(employees);
		
		//3. create a method to display all sorted names startig with "a" letter
		System.out.println("----------sorted Employees First Name started with a----------");
		printAllEmployeesOnCondition(employees,new MyCondition() {			
			@Override
			public boolean test(Employee e) {
				
				return e.getFirstName().startsWith("a");
			}
		});
	}

	private static void printAllEmployeesOnCondition(List<Employee> employees, MyCondition myCondition) {
		for (Employee employee : employees) {
			if(myCondition.test(employee)) {
				System.out.println(employee);
			}
		}
		
	}

	private static void printAllEmployees(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}		
	}

}