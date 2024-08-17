import java.util.*;
import java.io.*;
public class baekjoon_2075_240817 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;


        PriorityQueue<Integer> My_Que = new PriorityQueue<>((o1, o2) ->{
            int n1 = o1;
            int n2 = o2;
            if(n1<n2)
                return 1;
            else
                return -1;
        });

        for(int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++)
            {
                My_Que.add(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i = 0; i < N-1; i++)
        {
            My_Que.poll();
        }

        System.out.println(My_Que.poll());
    }
}
