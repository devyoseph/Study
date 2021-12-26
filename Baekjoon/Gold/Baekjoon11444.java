import java.util.Scanner;
public class Main {
    static long[][] arr = {{1,1},{1,0}};
    static long[][] Fibo(long N){
        if(N==0) {
            long[][] arr2= new long[2][2];
            arr2[0][0]=1;
            return arr2;
        }
        else if(N==1) {
            return arr;
        }
        long[][] before=Fibo(N/2);
        long[][] tmp = new long[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                for(int k=0;k<2;k++) {
                    tmp[i][j]+=before[i][k]*before[k][j]%1000000007;
                }
            }
        }
        if(N%2==0) {
            return tmp;
        }else {
            long[][] tmp2 = new long[2][2];
            for(int i=0;i<2;i++) {
                for(int j=0;j<2;j++) {
                    for(int k=0;k<2;k++) {
                        tmp2[i][j]+=tmp[i][k]*arr[k][j]%1000000007;
                    }
                }
            }
            return tmp2;
        }
    }
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        long[][] answer = Fibo(n-1);
        System.out.println(answer[0][0]%1000000007);
    }}
