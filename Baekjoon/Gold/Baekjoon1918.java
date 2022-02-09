import java.util.*;
import java.util.Stack;
 
public class Main {
    static int priority(char ch) {
    	switch(ch) {
    	case'*':
    	case'/': return 2;
    	case'-':
    	case'+': return 1;
    	default: return 0;
    	}
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<Character>();
    StringBuilder sb = new StringBuilder();
    String s = sc.next();
    char[] c = s.toCharArray();
    for(int i=0; i<s.length(); i++) {
    	int p = priority(c[i]);
    	switch(c[i]) {
    	case'+':
    	case'-':
    	case'*':
        case'/':
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
    
    System.out.println(sb.toString());
}
}
