import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] arr=new int[2];
		for(int i=0;i<N;i++) {
			int start=1;
			boolean found = false;
			arr[0]=sc.nextInt();
			arr[1]=sc.nextInt();
			Arrays.sort(arr); //arr[0] <= arr[1]
			while(!found) {
				if((arr[1]*start)%arr[0]==0) {
					System.out.println(arr[1]*start);
					found=true;
				}
				start++;
			}
		}
}}
