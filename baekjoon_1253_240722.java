import java.util.*;
import java.io.*;

public class baekjoon_1253_240722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int count = 0;

        for (int i = 0; i < N; i++) {
            int target = num[i];
            int start = 0;
            int end = N - 1;

            while (start < end) {
                if (start == i) {
                    start++;
                    continue;
                }
                if (end == i) {
                    end--;
                    continue;
                }

                int sum = num[start] + num[end];

                if (sum == target) {
                    count++;
                    break;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        System.out.println(count);
    }
}
