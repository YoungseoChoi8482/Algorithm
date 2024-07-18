import java.util.*;
import java.io.*;
public class baekjoon_1940_240718 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] materials = new int[N];

        for(int i =0; i < N; i++)
        {
            materials[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort((materials));

        int start_index = 0;
        int end_index = 0;
        int answer = 0;

        while(start_index != N && end_index<N)
        {
            int sum = materials[start_index] + materials[end_index];

            if(sum < M)
            {
                if(end_index==N-1) {
                    start_index++;
                    end_index = start_index+1;
                }
                else
                    end_index++;
            }

            else if(sum > M)
            {
                start_index++;
                end_index = start_index+1;
            }

            else
            {
                answer++;

                start_index++;
                end_index = start_index+1;
            }
        }

        System.out.println(answer);

    }
}
