package workplace;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int S = 0;
			int	V = 0;
			while(N-->0) {
				int input = sc.nextInt();
				int amount = 0;
				switch(input) {
					case 0: break;
					case 1: amount = sc.nextInt(); break;
					case 2: amount = sc.nextInt()*(-1); break;
				}
				V += amount;
				if(V<0) V=0;
				S += V;
			}
			System.out.println("#"+t+" "+Math.abs(S));
		}
		
}
}