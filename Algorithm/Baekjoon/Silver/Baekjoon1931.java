import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		int sum=0;
		int left=0;
		for(int i=0; i<N;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt(); //배열에 값을 넣어준다
		}
		Arrays.sort(arr, (o1, o2) -> { //정렬하는 코드
			if(o1[1] == o2[1]) {
		    return Integer.compare(o1[0],o2[0]);}
		else{
			return Integer.compare(o1[1],o2[1]); } });
	
    for(int i=0; i<N;i++) {
			if(arr[i][0]>=left) { //어차피 끝나는 시간 순차적으로 배열되어있기 때문에
				left=arr[i][1];   //오른쪽으로 가면서 겹치지 않는 구간을 만나면 바로 추가해준다
				sum++;
			}
	}
	System.out.print(sum);
    }}
