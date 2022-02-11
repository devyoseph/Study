import java.io.*;
import java.util.*;
public class Main {
	static boolean arr[][];
	static StringBuilder sb = new StringBuilder();
	static void quadTree(int row, int col, int size) {
		boolean full = true;
		for(int i=row;i<row+size;i++) {
			for(int j=col;j<col+size;j++) {
				if(arr[row][col]!=arr[i][j]) {
					full=false;
					j=col+size;
					i=row+size;
				}
			}
		}
		if(full) {
			sb.append(arr[row][col]==true?1:0);
			return;
		}else {
			sb.append("(");
			quadTree(row,col,size/2);
			quadTree(row,col+size/2,size/2);
			quadTree(row+size/2,col,size/2);
			quadTree(row+size/2,col+size/2,size/2);
			sb.append(")");
			return;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new boolean[N][N];
		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;j<N;j++) {
				if(s.charAt(j)=='1') {
					arr[i][j]=true;
				}
			}
		}
		quadTree(0,0,N);
		System.out.println(sb.toString());;
}}
