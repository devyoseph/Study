import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int arr[] = new int[101];
            int test = Integer.parseInt(br.readLine());
            int max=0;
            int answer=0;
            st= new StringTokenizer(br.readLine()," ");
            while(st.hasMoreTokens()) {
                arr[Integer.parseInt(st.nextToken())]++;
            }
            for(int i=1;i<101;i++) {
                if(arr[i]>=max) {
                    max=arr[i];
                    answer=i;
                }
            }
            System.out.println("#"+test+" "+answer);
        }
}}
