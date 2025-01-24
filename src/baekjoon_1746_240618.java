import java.util.*;
import java.io.*;

/*
HashSet이 Vector보다 검색속도가 빠른이유는?
 */
public class baekjoon_1746_240618 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> vector = new HashSet<>();
        Vector<String> conclude = new Vector<>();

        int count = 0;

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());

         for(int i = 0; i < N ; i++)
         {
             vector.add(br.readLine());
         }

         for(int j = 0; j < M; j++)
         {
             String temp =br.readLine();
             if(vector.contains(temp))
             {
                 count++;
                 conclude.add(temp);
             }
         }
          Collections.sort(conclude);

         System.out.println(count);

         conclude.forEach((item)->{
             System.out.println(item);
         });


    }
}
