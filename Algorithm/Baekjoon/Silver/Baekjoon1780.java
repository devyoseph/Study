import java.io.*;
import java.util.*;
public class Main {
	static int[][] arr;
	static int[] number = {-1,0,1};
	static int[] count = new int[3];
	static void countPaper(int row, int col, int length) {
		boolean full=true;
		for(int i=row;i<row+length;i++) {
			for(int j=col;j<col+length;j++) {
				if(arr[i][j]!=arr[row][col]) {
					full=false;
					j=col+length;
					i=row+length;
				}
		}}
		if(full==true) {
			count[arr[row][col]+1]++;
			return;
		}else {
			for(int m=0;m<3;m++) { 	
				for(int n=0;n<3;n++) {
					countPaper(row+m*(length/3),col+n*(length/3),length/3);
				}
			}
			return;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		countPaper(0,0,N);
		System.out.println(count[0]);
		System.out.println(count[1]);
		System.out.println(count[2]);
}}
