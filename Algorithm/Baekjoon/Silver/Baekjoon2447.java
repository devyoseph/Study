import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringBuilder st = new StringBuilder();
	 StringBuilder blank = new StringBuilder();
	 String[] star = new String[8]; //0~7항까지 배열에 저장
	 star[0] = "*"; //시작을 위해 넣어준다
     
	 for(int i =1; i < 8; i++) {
		 int length = (int)Math.pow(3, i-1); //i항을 작성하기 위해 i-1항의 길이를 가져온다
		 for(int j = 0; j<length; j++) {
			 blank.append(" "); //공백도 미리 만들어준다
		 }
		 for(int j = 0; j<length; j++) { //첫째 구역
			 int start = j*length;
			 int last = (j+1)*length;
//이전 항의 문자값은 substring을 통해 가져온다: 0, 3을 적으면 index[0]~index[2]까지 가져온다
			 st.append(star[i-1].substring(start, last));
			 st.append(star[i-1].substring(start, last));
			 st.append(star[i-1].substring(start, last));
		 }
		 for(int j = 0; j<length; j++) { //둘째 구역
			 int start = j*length;
			 int last = (j+1)*length;
			 st.append(star[i-1].substring(start, last));
			 st.append(blank.toString());
			 st.append(star[i-1].substring(start, last));
		 }
		 for(int j = 0; j<length; j++) { //셋째 구역
			 int start = j*length;
			 int last = (j+1)*length;
			 st.append(star[i-1].substring(start, last));
			 st.append(star[i-1].substring(start, last));
			 st.append(star[i-1].substring(start, last));
		 }
		 star[i] = st.toString();
		 st.delete(0, st.length());
		 blank.delete(0, blank.length());
//매번 사용한 StringBuilder를 초기화한다: 공백 데이터 또한 초기화하는 것을 잊으면 안된다
	 }
	 for(int i =1; i < 8; i++) {
		 int length = (int)Math.pow(3, i);
		 int indexplus = 0;
		 st.append(star[i]);
		 for(int j = 1; j<length; j++) {
			 int now = j*length +indexplus;
			 st.insert(now, "\n");
			 indexplus++;
		 }
//작성해준 배열에서 줄바꿈을 추가한다.
//줄바꿈을 추가할 때마다 index의 개수가 증가하는 것을 고려한 변수 now를 생성한다
		 star[i] = st.toString();
		 st.delete(0, st.length());
//줄바꿈한 값을 넣어주고 초기화
	 }
     int N = Integer.parseInt(br.readLine());
     int number = 0;
     while(N!=1) {
    	 N /= 3;
    	 number++;
//입력값은 3의 제곱으로 주어지는데 반복문을 통해 입력값의 지수승을 구한다
     }
     System.out.print(star[number]);
}	 
}
