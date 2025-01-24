import java.io.*;
import java.util.*;

public class baekjoon_9465_240830 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());


        for(int k = 0; k < T; k++)
        {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            int [] dp = new int[n*2];

            int [][] value = new int[3][n+1];

            for(int j = 1; j <=2 ; j++)
            {
                for(int l = 1; l <= n; l++)
                    value[j][l] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0 ; j < n*2 ; j++)
            {
                int level = 1;

            }








        }

    }

}
