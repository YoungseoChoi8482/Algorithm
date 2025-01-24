import java.util.*;
import java.io.*;

public class baekjoon_241003_1590 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int minWaitTime = Integer.MAX_VALUE;



        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int start_time = Integer.parseInt(st.nextToken());
            int interval = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            int waitTime = calculation(start_time,interval,count,T);

            if(waitTime != -1){
                minWaitTime = Math.min(minWaitTime,waitTime);
            }

        }

        if(minWaitTime == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(minWaitTime);
    }
    public static int calculation(int S, int I, int C ,int T){


        for(int j = 0; j < C ; j++)
        {
            if(S >= T)
            {
                return S-T;
            }
            S += I;
        }
            return -1;

    }
}
