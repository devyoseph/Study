import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2]; // [0]에 숫자를 넣어주고 [1]에 원래 index를 기록
		int[] sorted = new int[N]; //정렬 후 저장된 index에 순서를 넣어준다
	
    	StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=i;
		}
        //2차원 배열 오름차순 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
					if(o1[0]==o2[0]) return o1[1]-o2[1];
					else return o1[0]-o2[0];
			}});
            
	   int start=0; //순번을 기록할 변수 
	   sorted[arr[0][1]]=0; //처음항은 값을 넣어준다
       
       for(int i=1; i<N;i++) {
			if(arr[i][0]!=arr[i-1][0])start++; //이전값과 같다면 동일한 순위므로 값을 증가X
			sorted[arr[i][1]]=start; //순서를 index에 맞게 넣어준다
		}
       for(int i=0; i<N;i++) {
			bw.write(sorted[i]+" ");
		}
       bw.flush();
       bw.close();
 }}
