import java.util.*;
import java.io.*;

public class baekjoon_11047_240626 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        StringTokenizer st = new StringTokenizer(first);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        int [] arr = new int[N];

        for(int i = 0; i < N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = N - 1; i >= 0; i--) {
            if(arr[i] <= K) {
                count += K / arr[i];
                K = K % arr[i];
            }
        }

        System.out.println(count);

    }
}
