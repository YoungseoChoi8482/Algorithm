import java.util.*;
import java.io.*;

public class baekjoon_11279_240806 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1,o2) -> {
            int i = o1 > o2 ? -1 : 1;
            return i;
        });

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++)
        {
            int request = Integer.parseInt(br.readLine());

            if(request == 0)
            {
                if(MyQueue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(MyQueue.poll());
            }
            else
                MyQueue.add(request);

        }

    }
}
