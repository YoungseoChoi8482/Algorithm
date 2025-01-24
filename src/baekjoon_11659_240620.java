import java.util.*;
import java.io.*;
/*
미리 계산해 놓고 뽑는게 떠빠름
Stringbuilder알아두자

 */

public class baekjoon_11659_240620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();

        StringTokenizer st = new StringTokenizer(first);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String second = br.readLine();
        StringTokenizer st_2 = new StringTokenizer(second);

        int [] arr = new int[N +1 ];
        int [] prefixSum = new int[N + 1];

        for(int i = 1; i <= N ; i++)
        {
            arr[i] = Integer.parseInt(st_2.nextToken());
            prefixSum[i] = prefixSum[i -1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();

        for(int k = 0 ; k < M ; k++)
        {
            String input = br.readLine();
            StringTokenizer st_3 = new StringTokenizer(input);
            int i = Integer.parseInt(st_3.nextToken());
            int j = Integer.parseInt(st_3.nextToken());

            int count = prefixSum[j] - prefixSum[i-1];
            sb.append(count).append('\n');

        }

        System.out.print(sb);
    }
}
