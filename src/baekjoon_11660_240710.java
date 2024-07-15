import java.util.*;
import java.io.*;

//구간합 문제
public class baekjoon_11660_240710 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        StringTokenizer st = new StringTokenizer(first);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] D = new int[N+1][N+1];

        for(int i = 1; i <= N ; i++)
        {
             st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <= N ; j++)
            {
                D[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int [][] C = new int[N+1][N+1];

        for(int i = 1; i <= N ; i++)
        {
            for(int j = 1; j <= N ; j++)
            {
                C[i][j] = C[i-1][j] + C[i][j-1] - C[i-1][j-1] + D[i][j];
            }
        }
        int answer = 0;

        for(int i = 0; i < M ; i++)
        {
            st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                answer = C[c][d] - C[a-1][d] - C[c][b-1] + C[a-1][b-1];

            System.out.println(answer);
        }



    }
}
