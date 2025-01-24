import java.util.*;
import java.io.*;
// 마지막 숫자가 1 인경우 2인경우 3인경우로 나누어서 푼다.

public class baekjoon_9059_240625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];
            arr[0] = 1;

            for(int j = 1 ; j <= n ; j++)
            {
                if(j>=1)
                    arr[j] += arr[j-1];
                if(j>=2)
                    arr[j] += arr[j-2];
                if(j>=3)
                    arr[j] += arr[j-3];;
            }

            System.out.println(arr[n]);

        }
    }
}
