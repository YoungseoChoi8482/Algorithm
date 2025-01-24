import java.util.*;
import java.io.*;

public class baekjoon_1697_240807 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int count = 0;


        while(N!=X)
        {
            if(N*2 <= X+1)
            {
                N *= 2;
                count++;
            }
            else if(N > X) {
                N -= 1;
                count++;
            }
            else if(N*2 > X)
            {
                N -=1;
                count++;
            }
            else {
                N += 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
