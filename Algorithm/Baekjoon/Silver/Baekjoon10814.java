import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	List<String>[] arr = new ArrayList[201]; //201크기의 ArrayList 배열생성
	for (int i = 1; i < 201; i++) {
		arr[i] = new ArrayList<String>(); //배열 안에 재선언
	}
	int N=Integer.parseInt(br.readLine());
    
	for(int i=0;i<N;i++) {
		st = new StringTokenizer(br.readLine());
		int index=Integer.parseInt(st.nextToken()); //앞에 index를 받은 뒤
		arr[index].add(st.nextToken()); //index에 해당하는 곳에 문자열 추가
	}
	for(int i=1;i<201;i++) {
		for(int j=0;j<arr[i].size();j++) {
			System.out.println(i+" "+arr[i].get(j)); //문자열을 꺼내준다
		}
	}
}}


// import java.io.*;
// import java.util.*;
// public class Main {
// public static void main(String[] args) throws IOException{
// 	Scanner sc = new Scanner(System.in);
// 	List<String>[] arr = new ArrayList[201];
// 	for (int i = 1; i < 201; i++)arr[i] = new ArrayList<String>();
// 	int N=sc.nextInt();
// 	for(int i=0;i<N;i++) {
// 		int index=sc.nextInt();
// 		arr[index].add(sc.next());
// 	}
// 	for(int i=1;i<201;i++)
// 		for(int j=0;j<arr[i].size();j++)
// 			System.out.println(i+" "+arr[i].get(j));
// }}
