import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	int N = Integer.parseInt(st.nextToken());
	int M = Integer.parseInt(st.nextToken());
	int[] deque = new int[N];
	for(int i=0; i<N; i++) {
		deque[i]=i+1;
	}
	int[] extract = new int[M];
	st = new StringTokenizer(br.readLine()," ");
	for(int i=0; i<M;i++) { 
		extract[i]= Integer.parseInt(st.nextToken());
	}
	int focus=0;
	int sum=0;
	for(int i=0; i<M; i++) {
		int find = extract[i];
		int index =0;
		for(int k=0; k<N; k++) {
			if(deque[k]==find) {
				index=k;
				k+=N;}}
		sum+=findMin(focus,find,deque,N);
     	while(i!=N-1) {
     		if(index==N-1)index=-1;
     		if(deque[index+1]!=0) {
     			focus = index+1;
     			break;
     		}
     		index++;}}
	 System.out.println(sum);
}
public static int findMin(int focus, int find,int[] deque,int N) {
	int min1 = 0;
	int min2 = 0;
	int min=0;
	int start = focus;
	while(true) {
		if(deque[start]==find) {
			break;
		}
		start--;
		if(start==-1) {
			start=N-1;
		}
		if(deque[start]!=0) {
			min1++;}}
	start = focus;
	while(true) {
		if(deque[start]==find) {
			break;
		}
		start++;
		if(start==N) {
			start=0;
		}
		if(deque[start]!=0) {
			min2++;}}
	deque[start]=0;
	if(min1>=min2) {
		min=min2;
	}else {
		min=min1;
	}
	return min;
}}
