import java.util.*;
import java.io.*;

public class baekjoon_1932_250124 {

    static int N;
    static int[][] arr;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        dp = new Integer[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < i + 1; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(find(0, 0));
    }

    static int find(int depth, int idx) {
        if (depth == N - 1) {
            return arr[depth][idx];
        }

        if (dp[depth][idx] == null) {
            dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
        }
        return dp[depth][idx];
    }
}
