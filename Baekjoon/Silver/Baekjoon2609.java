import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[2];
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		int start=0;
		Arrays.sort(arr);
		while(true) {
			if(arr[0]%(arr[0]-start)==0 && arr[1]%(arr[0]-start)==0) {
				System.out.println(arr[0]-start);
				break;
			}
			start++;
		}
		start=1;
		while(true) {
			if((arr[1]*start)%arr[0]==0) {
				System.out.println(arr[1]*start);
				break;
			}
			start++;
		}
}}
