import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int tc=1;
		while(T-->0) {
			int N=0;
			switch(sc.next()) {
			case"SUN": N=7; break;
			case"MON": N=6; break;
			case"TUE": N=5; break;
			case"WED": N=4; break;
			case"THU": N=3; break;
			case"FRI": N=2; break;
			case"SAT": N=1; break;
			}
			System.out.println("#"+tc+" "+N);
			tc++;
		}
}}
