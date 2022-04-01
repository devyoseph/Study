import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        /*
         * N = 1 : 0
         * N = 2 : 3
         * N = 3 : 0
         * N = 4 : f(2)*3 + 2*f(0)
         * N = 6 : f(4)*3 + 2*f(2) + 2*f(0)
         * N = 8 : f(6)*3 + 2*f(4) + f(2)*2 + 2*f(0)
         * 
         * N : f(N-2)*f(2) + 2*f(N-4)
         */
        int[] dp = new int[31];
        dp[0] = 1; // 0은 입력값으로 들어오지 않으므로
        dp[2] = 3;
        dp[4] = 11;
        for (int i = 6; i <= N; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i - 2] * 3;
                for (int j = i - 4; j >= 0; j -= 2) {
                    dp[i] += 2 * dp[j];
                }
            }
        }
        System.out.println(dp[N]);
    }
}