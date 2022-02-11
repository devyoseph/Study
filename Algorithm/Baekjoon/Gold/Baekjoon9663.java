import java.util.Scanner;
public class Main {
	static int count=0; //개수를 세어줄 변수 count
	static int[] selected; //현재까지 놓은 퀸의 위치를 기록하는 곳
    
    //지금까지 체스판에 올려놓은 퀸의 위치와 겹치는지 아닌지 확인해준다
	static boolean check(int N, int Depth, int col) { //Depth가 곧 행, col은 열
		
        if(Depth==0)return true; //첫번째 줄에서는 제한 없이 퀸을 선택할 수 있다
        
		boolean judge=true;
        
		for(int i=0; i<Depth;i++) {
			if(Math.abs(i-Depth)==Math.abs(selected[i]-col) || selected[i]==col) {
             //대각선이거나 같은 줄이면 현재 위치에 퀸을 놓을 수 없다
				judge=false;
				i+=Depth;
			}
		}
		return judge;
	}
	
	
	static void nQueen(int N, int Depth) {
		if(Depth==N) { //재귀 깊이 N에 도달하면 모든 퀸을 놓았다는 뜻이므로 1개 추가한다
			count++;
			return;
		}
		for(int i=0; i<N;i++) {
			if(check(N,Depth,i)) { //메소드를 통해 퀸을 놓을 수 있으면 다음줄로 넘어간다(재귀호출)
				selected[Depth]=i; //값을 기록해주고
				nQueen(N,Depth+1); //다음 줄로 넘어간다
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		selected = new int[N];
		nQueen(N,0);
		System.out.print(count);
 }}
