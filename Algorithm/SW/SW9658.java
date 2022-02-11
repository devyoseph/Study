import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        int test = 0;
        while(TC-->0) {
            test++;
            String s = sc.next();
            int length = s.length()-1;
            int[] num=new int[3];
            for(int i=0;i<3;i++) {
                num[i] = Integer.parseInt(s.substring(i, i+1));
            }
            if(num[2]>=5) {
                 num[1]++;
            }
            if(num[1]==10) {
                num[0]++;
                num[1]=0;
            }
            if(num[0]==10) {
                length++;
                num[0]=1;
            }
            System.out.println("#"+test+" "+num[0]+"."+num[1]+"*10^"+length);
        }
}}
