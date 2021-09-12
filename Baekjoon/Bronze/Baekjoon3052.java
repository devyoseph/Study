import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
//처음에는 10개 빈배열을 만들고 집어넣는 방식,
//10개 데이터 안에서 비교하는 방식 등 생각했지만(크기순정렬)
//Set으로 그냥 풀었다
public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
         //나머지 배열 생성
           HashSet<Integer> hs = new HashSet<Integer>();
           int[] arr = new int[10];
           int a;
           int save;
           int count=0;
      //나머지 계산 배열
           for(int i=0;i<10;i++) {
          a=Integer.parseInt(br.readLine());
          arr[i]=a%42;}
      //Set안에 집어넣는다
          for(int i=0; i<10; i++) {
        	  save=arr[i];
        	  hs.add(save);
           	  }
          Iterator<Integer> it = hs.iterator();
          while(it.hasNext()) {
        	  it.next();
        	  count++;
          }
          System.out.println(count);
           
}}
