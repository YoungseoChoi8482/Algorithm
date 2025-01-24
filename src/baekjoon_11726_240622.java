import java.util.*;

public class baekjoon_11726_240622 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int MOD = 10007;
        int[] dp = new int[n + 1];

        dp[0] = 1;
        if (n >= 1) {
            dp[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        System.out.println(dp[n]);



    }
}
