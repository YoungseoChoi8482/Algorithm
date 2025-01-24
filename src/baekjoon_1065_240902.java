import java.util.*;
import java.io.*;

public class baekjoon_1065_240902 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        int hundred = 0;
        int ten = 0;
        int one = 0;

        for(int i = 1; i <= N; i++)
        {
            if(i>=100)
            {
                hundred = i / 100;
                ten = (i / 10) % 10;
                one = i % 10 ;

                if((hundred - ten) == (ten - one))
                    count++;
            }

            else
                count += 1;
        }

        System.out.println(count);
    }
}
