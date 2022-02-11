import java.util.*;
public class Main {
	static long C;
	static long modular(long A, long B) {
		if(B==1) return A%C;
		long half = modular(A,B/2)%C;
		if(B%2==0) {
			return half*half%C;
		} else {
			return (((half*half)%C)*A)%C;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long A = sc.nextLong();
		long B = sc.nextLong();
		C= sc.nextLong();
		System.out.println(modular(A,B));
}}
