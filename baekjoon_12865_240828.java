import java.io.*;
import java.util.*;

// 반복문을 역순으로 돌려서 다이내믹 프로그래밍을 구현한 것은 처음.
// 기본적으로 다이내믹 프로그래밍은 전부 훑는다는 생각을해야 한다.
// 또한 전부 훑으며 전의 상태와 비교해 업데이트를 한다는 것을 인지하자.
public class baekjoon_12865_240828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        int [] weight = new int[n+1];
        int [] value = new int[n+1];

        for (int i = 1; i <= n; i++)
        {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());

        }

        int [] dp = new int [k+1];

        for(int i = 1; i <= n ; i++)
        {
            for(int w = k; w >= weight[i] ; w--)
            {
                dp[w] = Math.max(dp[w], dp[w -weight[i]] + value[i]);
            }
        }

        System.out.println(dp[k]);




    }
}
