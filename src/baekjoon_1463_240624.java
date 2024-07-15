import java.util.*;
import java.io.*;

public class baekjoon_1463_240624 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int [] arr= new int[X+1];

        arr[1] = 0;


        for (int i = 2; i <= X; i++) {
            // 1을 빼는 경우
            arr[i] = arr[i - 1] + 1;

            // 2로 나누어 떨어지는 경우
            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }

            // 3으로 나누어 떨어지는 경우
            if (i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            }
        }


        System.out.println(arr[X]);
    }
}
