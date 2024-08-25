import java.util.*;
import java.io.*;

public class baekjoon_1149_240824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] cost = new int[n][3]; // 각 집을 칠하는 비용을 저장하는 배열
        int[][] dp = new int[n][3]; // 각 집까지의 최소 비용을 저장하는 DP 배열

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); // 빨강
            cost[i][1] = Integer.parseInt(st.nextToken()); // 초록
            cost[i][2] = Integer.parseInt(st.nextToken()); // 파랑
        }

        // 첫 번째 집의 비용 초기화
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        // 두 번째 집부터 마지막 집까지의 최소 비용 계산
        for (int i = 1; i < n; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]); // 빨강을 선택한 경우
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]); // 초록을 선택한 경우
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]); // 파랑을 선택한 경우
        }

        // 마지막 집의 최소 비용 중 최솟값을 출력
        int result = Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
        System.out.println(result);
    }
}