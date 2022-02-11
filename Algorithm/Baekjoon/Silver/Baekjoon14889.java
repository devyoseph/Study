import java.util.*;
public class Main {
	static int N;
	static boolean[] team;
	static int[][] S;
	static int min=2000; //N=20, S=100이 최대므로 min 최대는 약 2000
	
    //두 팀의 차이를 구하고 최소값이면 값을 갱신
	static void getMin(){
		int sum = 0; //변수는 하나로 충분하다
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
            //i번째 사람과 j번째 사람이 모두 같은 팀일 때
				if(team[i] && team[j]) {
					sum+=S[i][j]+S[j][i];
            //배열에 기록된 시너지 점수 2개를 더해준다
				}else if(!team[i] && !team[j]) {
					sum-=S[i][j]+S[j][i];
				}
			}
		}
		min = Math.min(min, Math.abs(sum));
		if(min==0) { //값이 0이면 바로 출력한다
			System.out.print(0);
			System.exit(0);
		}
	}
	
	static void teamSelect(int start, int Depth){
	if(Depth==N/2-1) { //0번 index는 이미 선택했으므로 -1
		getMin();
		return;
	}
		for(int i=start;i<N;i++) {
			if(!team[i]) {
				team[i]=true;
				teamSelect(i+1,Depth+1);
                //겹치지 않게 선택하기 위해 i+1임을 주의
				team[i]=false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = new int[N][N];
		team = new boolean[N];
		team[0]=true;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				S[i][j]=sc.nextInt();
			}
		}
		teamSelect(1,0);
        //파라미터를 두개 사용하는 이유는 중복을 막기 위해서이다
		System.out.print(min);
 }}


//SHORT
// import java.util.*;
// public class Main {
// 	static int N;
// 	static boolean[] team=new boolean[20];
// 	static int[][] S=new int[20][20];
// 	static int min=2000;
// 	static void getMin(){
// 		int sum = 0;
// 		for(int i=0; i<N; i++) {
// 			for(int j=i+1; j<N; j++) {
// 				if(team[i] && team[j]) {
// 					sum+=S[i][j]+S[j][i];
// 				}else if(!team[i] && !team[j]) {
// 					sum-=S[i][j]+S[j][i];}}}
// 		min = Math.min(min, Math.abs(sum));}
// 	static void teamSelect(int start, int Depth){
// 	if(Depth==N/2){
// 		getMin();
// 		return;}
// 		for(int i=start;i<N;i++) {
// 			if(!team[i]) {
// 				team[i]=true;
// 				teamSelect(i+1,Depth+1);
// 				team[i]=false; }}}
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		N = sc.nextInt();
// 		for(int i=0; i<N; i++) for(int j=0; j<N; j++)S[i][j]=sc.nextInt();	
// 		teamSelect(0,0);
// 		System.out.print(min);
//  }}
