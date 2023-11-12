package lambda_expression_demo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class Employee {
	int salary;
	String name;
	
	Employee(int salary , String name){
		this.salary = salary;
		this.name = name;
	}
}

public class FunctionOperations {

	public static void main(String[] args) {
		
		System.out.println("tet");
		// TODO Auto-generated method stub
		Function<Integer,Integer> f = n->n*n;
		System.out.println(f.apply(4));
	
		Function<String,Integer> f1 = str->{
			return str.length();
		};
		
		System.out.println(f1.apply("welcome"));
		System.out.println();
		
		Employee e1 = new Employee (50000 , "tom");
		Employee e2 = new Employee (30000 , "bango");
		Employee e3 = new Employee (100000 , "Girj");
		
		ArrayList<Employee> ar = new ArrayList<>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Function<Employee,Integer> fn = e-> {
			int sal = e.salary;
			int bonus;
			if (sal <50000 && sal >20000) {
				return bonus = sal/20;
			}
			else if (sal <60000 && sal >40000) {
				return bonus = sal/10;
			}
			else
				return bonus = 6000;
		};
		
		Predicate<Integer> pr = i->i>1500;
		
		Consumer<Employee> con = e->{
			System.out.println(e.name + " " + e.salary);	
		};
		
		
		
		ar.forEach(val ->{
			
			int bonus = fn.apply(val);
			if(pr.test(bonus)) {
			con.accept(val);
			}
			
		});
		
		System.out.println();
		
		Function<Integer,Integer> f11 = n->n*2;
		Function<Integer,Integer> f12 = n->n*n*n;
		
		System.out.println(f11.compose(f12).apply(2)); // 2 will go to f12
		System.out.println(f11.andThen(f12).apply(2));// 2 eill go to f11
	}	

}
