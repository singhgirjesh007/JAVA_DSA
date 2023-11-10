package stack_queue_operations;

import java.util.Stack;

public class PostfixEvaluationsAndConversition {
	
	public static int operation(int v1 , int v2 ,char ch) {
		
		if (ch == '+' ) {
		return v1 + v2;	
		}
		else if (ch == '-') {
			return v1 - v2;		
			
		}
		else if (ch == '*') {
			return v1 * v2;		
			
		}
		else if (ch == '/') {
			return v1 / v2;		
			
		}
		else 
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp = "264*8/+3-";
		
		Stack<Integer> val = new Stack<>();
		Stack<String> inf = new Stack<>();
		Stack<String> pre = new Stack<>();
		
		for(int i = 0; i< exp.length() ; i++) {
			
			char ch = exp.charAt(i);
			
			if ( ch >= '0' && ch <= '9') {
				
				val.push(ch - '0');
				inf.push(ch + "");
				pre.push(ch + "");
			}
			
			else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				
				int val2 = val.pop();
				int val1 = val.pop();
				int oval = operation(val1, val2, ch);
				
				val.push(oval);
				
				String pval2 = pre.pop();
				String pval1 = pre.pop();
				String opval = ch+pval1+pval2;
				
				pre.push(opval);
				
				String ival2 = inf.pop();
				String ival1 = inf.pop();
				String oival = '('+ival1+ch+ival2+')';
				
				inf.push(oival);
			}
			
			
		}
		
		System.out.println(val.peek());
		System.out.println(pre.peek());
		System.out.println(inf.peek());
		
	}

}
