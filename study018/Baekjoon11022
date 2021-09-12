import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
//readLine() = nextInt처럼 사용자한테 값을 받는다
//결과가 문자열이기 때문에 받자마자 int로 치환해줌       
           int t = Integer.parseInt(br.readLine());
//Integer처럼 자료를 받자마자 내가 원하는 모양으로 값을 받을 수 있다
//그 틀을 만들어주는 것이 StringTokenizer 스트링토크나이저이다
           StringTokenizer st;
//임포트되어있으면 인스턴스를 만들 필요 없다.           
           for(int i =1; i<=t; i++) {
//한 줄에 두개의 값이 잆력될 때 readLine으로 일단 값을 받는다
//그러나 SrtingTokenizer를 통해 StringTokenizer(받는 값, 받는 값들을 따로 저장하는 기준);
//로 띄어쓰기 기준으로 int a, int b에 nextToken으로 던져주는 토큰을 각각 받아준다         	   
        	   st = new StringTokenizer(br.readLine()," ");
        	   int a = Integer.parseInt(st.nextToken());
        	   int b = Integer.parseInt(st.nextToken());
        	   int c = a+b;
//bw.write는 문자열과 섞이게 되면 모두 문자열 처리가 되어 나온다
//\n(엔터) 마저도 만나면 전체가 문자열이 된다
        	   bw.write("Case #"+i+": "+a+" + "+b+" = "+c+"\n");
           }
           
           bw.flush();
           bw.close();
   
    }
}
