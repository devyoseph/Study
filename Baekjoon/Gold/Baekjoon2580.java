import java.util.*;
public class Main {
	static int[][] sudoku = new int[9][9]; // 입력값이 들어갈 배열
	static StringBuilder sb = new StringBuilder(); // 배열값 출력은 StringBuilder 사용
	static boolean found = false; // 첫번째 답안만 출력하기 위해 답을 찾았다고 알려주는 변수 생성

	static boolean check(int N, int row, int col) { //N이 그 자리에 들어갈 수 있는지 체크
		boolean judge = true; //판별 변수 judge
		int row_start = (row/3)*3; // 3x3 사각형 시작점
		int col_start = (col/3)*3;
		for(int i=0;i<9;i++) { //같은 줄에 있으면 fasle
			if(sudoku[row][i]==N || sudoku[i][col]==N) {
				judge=false;
				i=9;
			}
		}
		for(int i=row_start;i<row_start+3;i++){ //같은 3x3 사각형에 있으면 false
			for(int j=col_start; j<col_start+3;j++) {
				if(sudoku[i][j]==N) {
					judge=false;
				}
			}
		}
		return judge;
	}
	static void findAnswer(int row, int col) {
		if(col==9) { //9가 되면 0으로 만들어준다
			col=0;
			row++;
		}
		if(row==9) { //row가 9가 되면 출력
			found = true;
			for(int i=0; i<9;i++) {
				for(int j=0;j<9;j++) {
					sb.append(sudoku[i][j]+" ");
				}
				sb.append("\n");
			}
			System.out.print(sb.toString());
			return;
		}
		if(sudoku[row][col]==0) { //0의 값을 찾으면
			for(int i=1; i<10; i++) { // 1~9 대입
				if(found)return; //이미 정답을 찾았다면 탐색 중단
				if(check(i,row,col)) {
					sudoku[row][col]=i;
					findAnswer(row,col+1);
					sudoku[row][col]=0;
				}
			}
		}else {
			findAnswer(row,col+1);
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				sudoku[i][j]=sc.nextInt();
			}
		}
		findAnswer(0,0);
 }}
