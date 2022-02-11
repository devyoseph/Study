import java.util.Scanner;
import java.util.Stack;
import java.io.*;
 
public class Main {
	static int[][] arr = new int[100][100];
	static int answer,row,col;

    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    
    	int rod = 0; //전체 막대 변수
    	int cnt = 0; //현재 막대
    	int sum = 0; //생긴 파편들
        
    	String s = sc.next();
        
    	for(int i=0; i<s.length()-1; i++) {
    		if(s.charAt(i)=='(' && s.charAt(i+1)==')') { // ()는 무조건 레이저
    			sum += cnt;
    			i++;
    		}else if(s.charAt(i)=='(') { // 막대의 시작
    			rod++;
    			cnt++;
    		}else { // 막대의 끝
    			cnt--;
    		}
    	}
    	
    	System.out.println(sum+rod);
}
}