import java.util.*;
import java.io.*;
public class baekjoon_10214_240623 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int y_count = 0;
        int k_count = 0;


        for(int i = 0; i < T; i++)
        {
            for(int j = 0; j < 9 ; j++)
            {
                int y = scanner.nextInt();
                int k = scanner.nextInt();
                scanner.nextLine();

                y_count += y;
                k_count += k;


            }
            if(y_count == k_count)
                System.out.println("Draw");
            else if(y_count > k_count)
                System.out.println("Yonsei");
            else
                System.out.println("Korea");
        }
    }
}
