import java.util.*;
import java.io.*;
// 배열을 잘못설정하면 런타임에러가 날 수 있다
// nC2 (조합) 을 구하는 공식은 n * (n - 1) / 2 이다.  조합을 계산하는 기본공식에서 유도된 것이다.
// 문제 해결 흐름: 누적합 계산 -> 나머지 계산 -> 나머지의 빈도수 카운트
public class baekjoon_10986_240712 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long [] sum = new long [N];
        long [] divide = new long[M];
        long answer = 0;
        st = new StringTokenizer(br.readLine());
        sum[0] = Integer.parseInt(st.nextToken());

        for(int i = 1; i < N; i++)
        {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++)
        {
            int remainder = (int) (sum[i] % M);

            if(remainder == 0)
                answer++;

            divide[remainder]++;

        }

        for(int i = 0; i < M; i++)
        {
            if(divide[i] > 1)
                answer = answer + (divide[i] * (divide[i] - 1) / 2);
        }

        System.out.println(answer);

    }
}
