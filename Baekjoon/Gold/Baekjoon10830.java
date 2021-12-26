import java.util.Scanner;
public class Main {
	static int[][] A;
	static int N;
	static int[][] powerMatrix(long B) {
		if(B==1) {
			return A;
		}
		int[][] before = powerMatrix(B/2);
		int[][] tmp = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					tmp[i][j]+=before[i][k]*before[k][j]%1000;
				}
			}
		}
			
		if(B%2==0) {
			return tmp;
		}else {
			int[][] tmp2 = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					for(int k=0;k<N;k++) {
						tmp2[i][j]+=tmp[i][k]*A[k][j]%1000;
					}
				}
			}
			return tmp2;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A=new int[N][N];
		long B = sc.nextLong();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		int[][] answer = powerMatrix(B);
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(answer[i][j]%1000+" ");
			}
			System.out.println();
		}
}}
