import java.util.*;
import java.io.*;

public class baekjoon_18870_240820 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr= new int[N];
        int [] answer = new int[N];

        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int [] new_arr = Arrays.copyOf(arr,arr.length);


        Arrays.sort(arr);

        for(int i = 0; i < N; i++)
        {
            int standard = new_arr[i];

            for(int j = 0 ; j < N; j++)
            {
                if(standard > arr[j] && arr[j] != arr[j+1])
                    answer[i]++;
                else if(standard < arr[j])
                    break;
            }
        }

        for(int i = 0; i < N; i++)
        {
            System.out.print(answer[i] + " ");
        }


    }
}
