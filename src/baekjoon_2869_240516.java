/*
시간초과를 유의해야하는 문제는 수식을 이용해서 어떻게든 짧은 시간내에 풀 수 있도록 해주는 것이 좋다.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baekjoon_2869_240516 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());



        int day = (V - B) / (A - B);
        if((V - B) % (A - B) != 0)
            day++;

            System.out.println(day);

    }
}
