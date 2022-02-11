package workplace;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	ArrayList<String> arr;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	StringBuilder sb = new StringBuilder();
	for(int t=1; t<=10; t++) {
		int N = Integer.parseInt(br.readLine());
		arr= new ArrayList<String>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N ;i++) {
			arr.add(st.nextToken());
		} //초기값 세팅
		
		int M = Integer.parseInt(br.readLine()); //명령어 개수
		st = new StringTokenizer(br.readLine()); //한 줄에 다 받아준다음
		for(int i=0; i<M; i++) { //M만큼 반복합니다
			String command = st.nextToken(); //맨 앞은 명령어
			switch(command) {
			case"I":
				int insert = Integer.parseInt(st.nextToken());
				int num = Integer.parseInt(st.nextToken());
				for(int j=0; j<num; j++) {
					arr.add(insert,st.nextToken());
					insert++; //추가하면서 인덱스 자동 증가합니다
				}
				break;
			case"D":
				int delete = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				for(int j=0; j<num2; j++) {
					arr.remove(delete);
				}
			}

		}
		
		for(int i=0; i<10;i++) { //맨 앞 10개만 뽑아줍니다.
			sb.append(" "+arr.get(i));
		}
		System.out.println("#"+t+sb.toString());
		sb.setLength(0);
	}
}
}
