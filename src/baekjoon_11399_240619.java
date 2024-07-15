import java.io.*;
import java.util.*;

public class baekjoon_11399_240619 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        StringTokenizer st = new StringTokenizer(N);
        int n = Integer.parseInt(st.nextToken());

        String p = br.readLine();

        int [] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(p);

        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;

        for(int i = 0; i < n ; i++)
        {

            for(int j = 0; j < i+1 ; j++)
            {
                count += arr[j];
            }
        }

        System.out.println(count);
    }
}
