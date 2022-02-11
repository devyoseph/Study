import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] A;
		boolean judge=true;
		int K = Integer.parseInt(br.readLine());
		while(K-->0) {
			st=new StringTokenizer(br.readLine()," ");
			int V = Integer.parseInt(st.nextToken());
			A=new int[200001];
			int E = Integer.parseInt(st.nextToken());
			for(int i=0;i<E;i++) {
				st=new StringTokenizer(br.readLine()," ");
				int num = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				int arr1 = A[num];
				int arr2 = A[num2];
				if(arr1==0 & arr2==0) {
					A[num]=1;
					A[num2]=-1;
				}else if(arr1==1 && arr2==0) {
					A[num2]=-1;
				}else if(arr1==-1 && arr2==0) {
					A[num2]=1;
				}else if(arr1==0 && arr2==1){
					A[num]=-1;
				}else if(arr1==0 && arr2==-1){
					A[num]=1;
				}else if(arr1!=0 && arr2!=0 && arr1==arr2) {
					judge=false;
					break;
				}
			}
			System.out.println(judge?"YES":"NO");
		}
}}
