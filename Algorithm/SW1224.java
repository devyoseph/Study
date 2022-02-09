package workplace;
import java.util.*;
import java.util.Stack;
 
public class Solution {
    static int priority(char ch) {
    	switch(ch) {
    	case'*': return 2;
    	case'+': return 1;
    	default: return 0;
    	}
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<Character>();
    StringBuilder sb = new StringBuilder();
    for(int t = 1; t<=10; t++) {
        int length = sc.nextInt();
        char[] c = sc.next().toCharArray();
        for(int i=0; i<length; i++) {
        	int p = priority(c[i]);
        	switch(c[i]) {
        	case'+':
        	case'*':
        		while(!stack.isEmpty() && priority(stack.peek())>=p){
        			sb.append(stack.pop());
        		}
        		stack.push(c[i]);
        		break;
        		
        	case')':
        		while(!stack.isEmpty() && stack.peek() != '(') {
        			sb.append(stack.pop());
        		}
        		stack.pop();
        		break;
        		
        	case'(':
        		stack.push('(');
        		break;
        		
        	default:
        		sb.append(c[i]);
        	}
        	
        }
        while(!stack.isEmpty()) {
        	sb.append(stack.pop());
        }
        Stack<Integer> stack2 = new Stack<Integer>();
        char[] c2 = sb.toString().toCharArray();
        int prev,next;
        for(int i=0; i<c2.length; i++) { // 소괄호를 지워줬으니 새로운 length 사용
        	switch(c2[i]) {
        	case'+':
        		next = stack2.pop();
        		prev = stack2.pop();
        		stack2.push(prev+next);
        		break;
        	case'*':
        		next = stack2.pop();
        		prev = stack2.pop();
        		stack2.push(prev*next);
        		break;
        	default:
        		stack2.push(Character.getNumericValue(c2[i]));
        	}
        }
        System.out.println("#"+t+" "+stack2.pop());
        sb.setLength(0);
    }
     
}
}
