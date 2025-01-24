import java.util.*;
import java.io.*;

public class baekjoon_1629_2501118 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());


        long answer = powerMod(A,B,C);

        System.out.println(answer);


    }

    static long powerMod(long a, long b ,long c)
    {
        long result = 1;
        a = a % c;

        while (b > 0)
        {
            if((b & 1) == 1)
            {
                result = (result * a) % c;
            }
            a = (a  * a) % c;
            b >>= 1;
        }

        return result;
    }

}
