import java.util.*;
public class Main {
	static int Five(int N, int sum) {
		if(N==0)return sum;
		return Five(N/5,sum+N/5);
	}
	static int Two(int N, int sum) {
		if(N<=1)return sum;
		return Two(N/2,sum+N/2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		int five=Five(N,0)-Five(M,0)-Five(N-M,0);
		int two=Two(N,0)-Two(M,0)-Two(N-M,0);
		System.out.println(Math.min(five, two));
}}
