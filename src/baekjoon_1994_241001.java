import java.util.*;
import java.io.*;

public class baekjoon_1994_241001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr); // 배열을 정렬한다

        // 등차수열의 최대 길이를 저장할 변수
        int maxLength = 1;

        // DP 테이블: 각 숫자 간의 공차에 따른 등차수열의 길이를 저장
        HashMap<Integer, Integer>[] dp = new HashMap[N];

        for (int i = 0; i < N; i++) {
            dp[i] = new HashMap<>();
        }

        // 모든 숫자 쌍에 대해 공차를 계산하고 DP 테이블 갱신
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                int interval = arr[i] - arr[j]; // 두 수의 공차
                // 현재 공차로 만든 등차수열의 길이를 갱신
                dp[i].put(interval, dp[j].getOrDefault(interval, 1) + 1);
                maxLength = Math.max(maxLength, dp[i].get(interval)); // 최대 길이 갱신
            }
        }

        System.out.println(maxLength); // 결과 출력
    }
}

