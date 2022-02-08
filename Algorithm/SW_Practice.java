package workplace;
import java.io.*;
import java.util.*;
 
public class Solution {
	static int N,H;
	static char[][] ground; 
	static void cover(int row, int col, int range) {
		for(int i=-range; i<=range; i++) {
			if(i==0 || row+i<0 || row+i>=N) continue;
			if(ground[row+i][col]=='H') {
				ground[row+i][col]='X';
				H--;
			}
			if(col+i<0 || col+i>=N) continue;
			if(ground[row][col+i]=='H') {
				ground[row][col+i]='X';
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
    	for(int i=0; i<N; i++) {
    		String row = sc.next();
    		for(int j=0; j<N; j++) {
    			ground[i][j] = row.charAt(j);
    			if(ground[i][j]=='H') {
    				H++;
    			}
    		}
    	}
    	for(int i=0; i<N; i++) {
    		for(int j=0; j<N; j++) {
    			switch(ground[i][j]) {
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
