import java.util.*;
import java.io.*;

public class baekjoon_31994_240910 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        String answer= "";
        int temp = 0;
        for(int i = 0; i < 7; i++)
        {
            String line = br.readLine();
            st = new StringTokenizer(line);

            String name = st.nextToken();
            int level = Integer.parseInt(st.nextToken());

            if(level > temp)
            {
                answer = name;
                temp = level;
            }
        }

        System.out.println(answer);
    }
}
