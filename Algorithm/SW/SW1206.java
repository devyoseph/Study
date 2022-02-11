import java.io.*;
import java.util.*;
class Solution {
    static int[] arr;
    static int view(int index) {
        if(index==0 || index==1 || index==arr.length-2 || index==arr.length-1) {
            return 0;
        }
        int lo = 0;
        int hi = arr[index];
        for(int i=-2;i<3;i++) {
            if(i==0)continue;
            lo=Math.max(lo, arr[index+i]);
            if(lo>=hi) {
                return 0;
            }
        }
        return hi-lo<0?0:hi-lo;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test = 0;
        for(int i=0;i<10;i++) {
            int count=0;
            test++;
            arr = new int[Integer.parseInt(br.readLine())];
            st= new StringTokenizer(br.readLine()," ");
            for(int j=0;j<arr.length;j++) {
                arr[j]=Integer.parseInt(st.nextToken());
                if(j>=2) {
                    count+=view(j-2);
                }
            }
            System.out.println("#"+test+" "+count);
        }
}}
