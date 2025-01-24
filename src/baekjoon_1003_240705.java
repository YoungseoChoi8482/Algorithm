import java.util.*;
import java.io.*;
// 다이나믹 프로그래밍에 대하여 복습하자.
// Stringbuilder문법도 반드시 복습하자.(toString사용법 포함)
public class baekjoon_1003_240705 {


    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 최대 40까지의 fibonacci 호출 횟수를 미리 계산
        int[][] dp = new int[41][2];
        dp[0][0] = 1; // fibonacci(0)을 호출할 때 0 호출 횟수
        dp[0][1] = 0; // fibonacci(0)을 호출할 때 1 호출 횟수
        dp[1][0] = 0; // fibonacci(1)을 호출할 때 0 호출 횟수
        dp[1][1] = 1; // fibonacci(1)을 호출할 때 1 호출 횟수

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n][0]).append(" ").append(dp[n][1]).append("\n");
        }

        System.out.print(sb.toString());

    }
}
