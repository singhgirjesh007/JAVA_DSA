package stack_queue_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {

	public static int precedence(char ch) {

		int flag = 0;
		if (ch == '+') {
			flag = 1;
		} else if (ch == '-') {
			flag = 1;
		} else if (ch == '*') {
			flag = 2;
		} else if (ch == '/') {
			flag = 2;
		}

		return flag;
	}
	
	public static int precedence2(char ch) {

		
		if (ch == '+') {
			return 1;
		} else if (ch == '-') {
			return 1;
		} else if (ch == '*') {
			return 2;
		} else if (ch == '/') {
			return 2;
		}else {
			return 0;
		}

		
	}


	public static int operations(int v1, int v2, char ch) {

		int flag = 0;
		if (ch == '+') {
			flag = v1 + v2;
		} else if (ch == '-') {
			flag = v1 - v2;
		} else if (ch == '*') {
			flag = v1 * v2;
		} else if (ch == '/') {
			flag = v1 / v2;
		}

		return flag;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String exp = br.readLine();

		String exp = "5+3(7-2*4/2)";
		Stack<Integer> opnds = new Stack<>();
		Stack<Character> optors = new Stack<>();
		
		for (int i =0 ; i<exp.length() ; i++) {
			char ch = exp.charAt(i);
			
			if ( ch == '(') {
				optors.push(ch);	
			}
			else if (Character.isDigit(ch)) {
				opnds.push(ch-'0');	 //char to Integer
			}
			else if (ch == ')') {
				while (optors.peek() != '(' ) {
					int v2 = opnds.pop();
					int v1 = opnds.pop();
					char ch1 = optors.pop();
					int opv = operations(v1, v2, ch1);
					
					opnds.push(opv);
				}
				
				optors.pop();
			}
			
			else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' ) {
				
				while (optors.size() > 0 && optors.peek() != '(' 
						&& precedence(ch) <= precedence(optors.peek())) {
					int v2 = opnds.pop();
					int v1 = opnds.pop();
					char ch1 = optors.pop();
					int opv = operations(v1, v2, ch1);
					
					opnds.push(opv);		
				}
				
				optors.push(ch);
				
			}	
		}
		
		while (optors.size() != 0 ) {
			int v2 = opnds.pop();
			int v1 = opnds.pop();
			char ch1 = optors.pop();
			int opv = operations(v1, v2, ch1);
			
			opnds.push(opv);
		}
		
		System.out.println(opnds.peek());
	}

}
