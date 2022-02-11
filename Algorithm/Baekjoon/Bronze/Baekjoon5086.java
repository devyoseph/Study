import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A==0 && B==0)break;
			else if(A>B) {
				System.out.println(A%B==0?"multiple":"neither");
			}else {
				System.out.println(B%A==0?"factor":"neither");
			}
		}
 }}
