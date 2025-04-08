import java.util.*;
import java.io.*;

public class baekjoon_11053_250128 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N;
        int [] arr;
        int [] dp;
        int answer = 0;

        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        dp = new int[N];

        Arrays.fill(dp,1); // Fill the entire dp[] with 1.

        st = new StringTokenizer(br.readLine());
        for(int i=0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < N; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[i] > arr[j])
                {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        for(int i = 0; i < N; i++)
        {
            answer = Math.max(answer,dp[i]);
        }

        System.out.println(answer);
    }



} 