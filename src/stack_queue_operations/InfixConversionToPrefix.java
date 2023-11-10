package stack_queue_operations;

import java.util.Stack;

public class InfixConversionToPrefix {
	
	public static int precedence(char ch) {
		
		if (ch == '+' || ch == '-')
			return 1;
		else if ( ch =='*' || ch == '/')
			return 2;
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp=  "a*(B-c)/d+e";
		
		Stack<String> prf = new Stack<>();
		Stack<String> pos = new Stack<>();
		
		Stack<Character> opr = new Stack<>();
		
		for(int i =0 ; i< exp.length () ; i++) {
			
			char ch = exp.charAt(i);
			
			if (ch == '(') {
				opr.push(ch);	
			}
			
			else if ( (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
				prf.push(ch +"");
				pos.push(ch +"");	
			}
			else if (ch ==')') {
				while (opr.peek() != '(') {
					
					String val2 = prf.pop();
					String val1 = prf.pop();
					char op = opr.pop();
					String oprf = op + val1 + val2  ;
					
					prf.push(oprf);	
				}
				
				opr.pop();
			}
			
			else if (ch == '+' || ch == '-' || ch == '*'|| ch == '/') {
				
				while ( opr.size() >0 && opr.peek() != '(' 
						&& precedence(ch) <= precedence(opr.peek()) ) {
						
						String val2 = prf.pop();
						String val1 = prf.pop();
						char op = opr.pop();
						
						String oprf = op + val1 + val2  ;
						prf.push(oprf);
					
				}
				
					opr.push(ch);
				
			}
			
		}
		
		while (opr.size() != 0) {
			
			String val2 = prf.pop();
			String val1 = prf.pop();
			char op = opr.pop();
			String oprf = op + val1 + val2  ;
			
			prf.push(oprf);	
		}
		
		System.out.println(prf.peek());
	}

}
