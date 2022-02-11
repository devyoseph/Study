import java.io.*;
public class Main {
public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int[] count = new int[8001]; // -4000~+4000을 저장
	   Integer[] mode = null; //최빈값을 담는 곳 처음값과 그다음으로 작은 값이 들어간다
	   int N = Integer.parseInt(br.readLine());
	   int max=-4000,min=4000,many=-1, center=0,middle=0; //최대값, 최소값, 카운팅배열 중 가장 큰 값; 중앙값
	   
	   double sum=0.0; //평균을 계산하기 위한 합
	   
	   for(int i=0; i<N;i++) {
		   int num=Integer.parseInt(br.readLine());
		   
		   sum+=num; //입력값을 받으면서 sum에 계속 더한다
		   
		   if(num<min)min=num; 
		   if(num>max)max=num; //최대 최소를 기록
		   
		   count[num+4000]++; //음수를 고려해 모든 수에 4000을 더해 저장
	   }
	   
	   double avg = sum/N; //평균을 계산
	    boolean needMiddle =true; //중간값은 한번만 구하면 된다
	   for(int i=0; i<8001;i++) { //카운팅 배열 탐색
		   
		   center+=count[i]; //카운팅배열에서 누적합을 계산하고
		   
		if(center>=N/2+1 && needMiddle) { //중앙값 가져오기, ==으로 하면 문제가 발생한다
			middle=i-4000;
			needMiddle=false;
		}	
		
		if(count[i]>many) { //현재 기록된 many보다 많으면 배열을 만들어 [0]번 인덱스에 저장
			   many=count[i];
			   mode = new Integer[2];
			   
			   mode[0]=i-4000; // 4000을 더해 저장했으니 다시 빼서 가져온다
			   
		   }else if(count[i]==many && mode[1]==null) { //0번에 이미 기록되어있을 경우
			   mode[1]=i-4000; //그 다음으로 최빈값 저장
		   }
	   }
	   System.out.println(String.format("%.0f", avg));
	   System.out.println(middle);
	   System.out.println(mode[1]==null?mode[0]:mode[1]);
	   System.out.println(max-min);
}}
