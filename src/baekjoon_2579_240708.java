import java.util.*;
import java.io.*;
//다이내믹 프로그래밍 방식 반드시 복습하자.
//먼저 점화식을 설정하는 것이 중요하다.

public class baekjoon_2579_240708 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        // 계단 점수 입력
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 초기값 설정
        dp[1] = arr[1];
        if (n > 1) {
            dp[2] = arr[1] + arr[2];
        }

        // 동적 프로그래밍을 사용하여 최대 점수 계산
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }

        // 결과 출력
        System.out.println(dp[n]);
    }
}
