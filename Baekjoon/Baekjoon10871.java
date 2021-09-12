import java.io.*;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {
/* StringTokenizer로 데이터를 배열로 만들기
Collections Framework의 Iterator가 생각나는가?
Iterator를 인스턴스화하고 while(i.hasNext())를 통해 모든 객체들을 꺼내고서야
while문이 끝난다
 
 <기본지식>
여기서 StringTokenizer의 두 메소드를 알아야한다
1).countTokens()  : 토큰의 수를 반환한다
2).hasMoreTokens()

<순서>
1)당연히 값을 먼저 받아줘야한다. 배열의 크기를 먼저 정하기 전에
값을 받고 배열의 크기를 받아내야한다
String st = new StringTokenizer(br.readLine, " ");
일단 st안에 토큰들을 집어넣어놨다. 띄어쓰기를 기준으로 나눠져있다

2)먼저 빈배열을 만든다. 배열의 크기는 처음에 정해줘야 하므로
String[] arr = new String[st.countTokens];
로 토큰의 개수만큼 배열의 크기를 정한다

3)배열 안에 집어넣는다(while문 사용)
외부에서 배열의 초기값 int i=0;를 만들어주고
hasMoreTokens를 통해
토큰이 없어지면 반복문을 탈출하게 해준다

만든 배열을 왼쪽에 놓고 집어넣는다
while(st.hasMoreTokens()){
		arr[i] = st.nextToken();
		i++;
}

*/           
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
           StringTokenizer st, st2;
           st = new StringTokenizer(br.readLine()," ");
           int t = Integer.parseInt(st.nextToken());
           final int val = Integer.parseInt(st.nextToken());
           st2 = new StringTokenizer(br.readLine()," ");
           int a;
        	  //while(st2.hasMoreTokens()) 
        	  for(;st2.hasMoreTokens();){
        		  a = Integer.parseInt(st2.nextToken());
        		  if(a<val) {
        		  bw.write(a+" ");
        	  }
        	  }
 //          st2 = new StringTokenizer(br.readLine()," ");
           //st2안에는 토큰들이 들어간상태 하나하나 비교
     
//           while(st2.hasMoreTokens()) {
//        	   bw.write()
////        	   int a = Integer.parseInt(st2.nextToken());
////        	   if(a<val) {
////        		   bw.write(a+" ");
////        	   }
//        	   
//           }
//           
//           
//
//     
//           }
           bw.flush();
           bw.close();
              
    }}

