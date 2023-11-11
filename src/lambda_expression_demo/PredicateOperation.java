package lambda_expression_demo;

import java.util.function.Predicate;

/**
 * 
 * @author singh
 *Predicate is functional interface with test method which return boolean value
 */

public class PredicateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = i->(i>10);
		
		
		System.out.println(p.test(20));
		
		Predicate<String> p1 = s->(s.length()>4);
		
		
		System.out.println(p1.test("wlecomwe"));
		System.out.println();
		String[] name = {"names" , "bingo" ,"welcome" , "tom"};
		
		for(String n : name) {
			
			if(p1.test(n)) {
				System.out.println(n);
			}
			
		}
	}

}
