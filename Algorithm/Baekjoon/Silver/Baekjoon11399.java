import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] time = new int[N];
		int sum=0;
		for(int i=0;i<N;i++){
			time[i]=sc.nextInt();
		} //배열에 값을 넣어줌
        
		for(int i=0;i<N;i++){
			int max=0; //최대값 탐색
			int index=0; //최대값의 index를 저장
			for(int j=0; j<N;j++) {
				if(time[j]>max) {
					max=time[j];
					index=j;
				}
			}
			time[index]=0; //최대값을 얻어낸 후 배열에서 0으로 만든다
			sum+=max*(i+1);
		}
		System.out.print(sum);
	}
}
