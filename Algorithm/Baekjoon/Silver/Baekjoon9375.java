import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			String[] parts = new String[30];
			int[] num = new int[30];
			int N =sc.nextInt();
			int sum=1;
			while(N-->0) {
				String First = sc.next();
				String Last = sc.next();
				for(int i=0;i<30;i++) {
					if(parts[i]==null) {
						parts[i]=Last;
						num[i]=2;
						i=30;
					}else if(parts[i].equals(Last)) {
						num[i]++;
						i=30;
					}
				}
			}
			for(int i=0;i<30;i++) {
				if(num[i]!=0) {
					sum*=num[i];
				}
			}
			System.out.println(sum-1);
		}
}}
