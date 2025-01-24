import java.util.*;
import java.io.*;
// 결국 거듭제곱을 분해하는게 이 문제의 목적이었다!
public class baekjoon_241004_1166 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());


        double answer =binarySearch(L, W , H, N); // 가장 작은 변보다는 크거나 같아야 하기 때문에 min보다 클 경우 min을 넣는다.


        System.out.printf("%.10f",answer); // java에서도 printf문이 된다는 거 잊지말자.
    }

    public static double binarySearch(int L, int W , int H, int N)
    {
        double left =0;
        double right = Math.min(Math.min(L,W),H);
        double mid = 0;

        while(left < right)
        {
            mid = (right + left) / 2;
            long count = (long)(L/mid) * (long)(W/mid) * (long)(H/mid);

           if(count < N)
           {
               if(right == mid)
                   break;
               right = mid;
           }
           else {
               if(left == mid) break;
               left = mid;
           }

        }

        return left;
    }

}
