import java.util.*;
import java.io.*;

public class baekjoon_1072_240926 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());

        int Z = (int) (Y*100 / X);

        if(Z>=99)
        {
            System.out.println(-1);
            return;
        }

        int left = 0;
        int right = 1000000000;

        int result = -1;

        while(left <= right)
        {
            int mid = (left + right)  / 2;

            long newZ = (Y + mid) * 100 / (X + mid);

            if(newZ > Z)
            {
                result = mid;
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        System.out.println(result);

    }
}
