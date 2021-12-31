import java.io.*;
import java.util.*;
public class Main {
	static long MOD = 1000000007;
	static Long[][] dp;
	static int[] arr;
	static int sum=1;
	
	static long GCD(int start, int last, int number) {
		if(start>=last || number>=10000) return 1;
		int min=10001;
		int new_start=0;
		int new_last=last;
		boolean ing=false;
		boolean found =false;
		for(int i=start;i<last;i++) {
			if(!ing && arr[i]>number) {
				min=Math.min(min, arr[i]);
				ing = true;
				found=true;
				new_start=i;
			}else if(ing && arr[i]<=number) {
				ing=false;
				new_last=i;
				i=last;
				break;
			}else if(ing && arr[i]>number) {
				min=Math.min(min, arr[i]);
			}
		}
		if(found) {
			sum*=pow(new_last-new_start,min-number)%MOD;
		}
		return GCD(new_start,new_last,min)+GCD(new_last,last,number);
	}
	static long pow(int N,int ex) {
		if(ex==0) return 1;
		if(dp[N][ex]==null) {
			long before = pow(N,ex/2)%MOD;
			if(ex%2==0) {
				dp[N][ex]=before*before%MOD;
			}else {
				dp[N][ex]=(before*before%MOD)*N%MOD;
			}
		}
		return dp[N][ex]%MOD;
	}
	public static void main(String[] args) {
	dp=new Long[10001][10001]; //팩토 / 승
	dp[0][1]=1L;
	for(int i=1;i<10001;i++) {
			dp[i][0]=1L;
			dp[i][1]=dp[i-1][1]*i%MOD;
	}
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int tc=1;
	while(T-->0) {
		sum=1;
		arr = new int[10001];
		int N = sc.nextInt();
		while(N-->0) {
			arr[sc.nextInt()]=sc.nextInt();
		}
		GCD(0,10001,0);
		System.out.println("#"+tc+" "+sum);
		tc++;
	}
}}
