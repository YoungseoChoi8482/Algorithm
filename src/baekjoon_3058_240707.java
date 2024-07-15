import java.util.Scanner;
import java.io.*;
public class baekjoon_3058_240707 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;



        for(int i = 0; i < n; i++)
        {
            int small = 101;
            for(int j = 0; j < 7 ; j++)
            {
               int k = scanner.nextInt();

                if(k % 2 == 0 && small > k)
                    small = k;
                if(k % 2 == 0)
                    sum += k;

            }
            System.out.println(sum + " "+ small);
            sum = 0;
        }

    }
}
