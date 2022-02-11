package workplace;
import java.io.*;
import java.util.*;
 
public class Solution {
	static int N,H;
	static char[][] ground; 
	static void cover(int row, int col, int range) {
		for(int i=-range; i<=range; i++) {
			
			if(i==0) continue; // 자기 자신이 있는 곳은 검사하지 않아도 됩니다
			
			if(row+i>=0 && row+i<N && ground[row+i][col]=='H') {
				ground[row+i][col]='X'; // 행에서 'H'인 부분 수거
				H--;
			}
			
			if(col+i>=0 && col+i<N && ground[row][col+i]=='H') {
				ground[row][col+i]='X'; // 열에서 'H'인 부분 수거
				H--;
			}
		}
	}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int TC = sc.nextInt();
    for(int t=1; t<=TC; t++) {
    	N = sc.nextInt();
    	ground = new char[N][N];
    	H = 0;
    	for(int i=0; i<N; i++) { // 값들을 2차원 배열에 저장
    		String row = sc.next(); // 2차원배열을 사용하지 않고 1차원 String = replace 사용
    		for(int j=0; j<N; j++) {
    			ground[i][j] = row.charAt(j);
    			if(ground[i][j]=='H') { // 입력값에서 H값을 카운트
    				H++;
    			}
    		}
    	}
    	for(int i=0; i<N; i++) {
    		for(int j=0; j<N; j++) {
    			switch(ground[i][j]) { // switch 문으로 분기
    			case'X': break;
    			case'H': break;
    			case'A': cover(i, j, 1); break;
    			case'B': cover(i, j, 2); break;
    			case'C': cover(i, j, 3); break;
    			}			
    		}
    	}
    	
    	System.out.println("#"+t+" "+H);
    }
    
}
}
