import java.io.*;
import java.util.*;
public class Main {
	static boolean[][] arr;
	static int colorPaper(int row, int col, int length, boolean color) {
		boolean full=true;
		for(int i=row;i<row+length;i++) {
			for(int j=col;j<col+length;j++) {
				if(arr[i][j]!=color) {
					full=false;
					j=col+length;
					i=row+length;
				}
			}
		}
		if(length==0) {
			return 0;
		}
		else if(full==true) {
			return 1;
		}else {
			return colorPaper(row,col,length/2,color)+ //1사분면
					   colorPaper(row+length/2,col,length/2,color)+ //2사분면
					   colorPaper(row,col+length/2,length/2,color)+ //3사분면
					   colorPaper(row+length/2,col+length/2,length/2,color);//4사분면	    	
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new boolean[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(sc.nextInt()==1) {
					arr[i][j]=true;
				}else {
					arr[i][j]=false;
				}
			}
		}
		System.out.println(colorPaper(0,0,N,false));
		System.out.println(colorPaper(0,0,N,true));
}}
