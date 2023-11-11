package lambda_expression_demo;

import java.util.function.Predicate;

public class PredicateOperation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 20, 4, 50, 70, 60, 15, 3, 12, 14 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 30;

		for (int n : arr) {

			// if (p1.test(n) && p2.test(n)) { joining of predicate through and
			if (p1.and(p2).test(n)) {
				System.out.println(n);
			}
		}

		System.out.println();

		for (int n : arr) {

			// if (p1.test(n) && p2.test(n)) { joining of predicate through and
			if (p1.or(p2).test(n)) {
				System.out.println(n);
			}
		}
		
		System.out.println("nagate method is basically nagative of expression");
		for (int n : arr) {

			// if (p1.test(n) && p2.test(n)) { joining of predicate through and
			if (p1.negate().test(n)) {
				System.out.println(n);
			}
		}

	}

}
