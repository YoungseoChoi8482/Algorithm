import java.util.*;

public class baekjoon_11727_240821 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int  [] arr =  new int [n+1];

        arr[1] = 1;


        if(n==1)
            System.out.println(arr[1]);
        else
        {
            for(int i = 2; i <= n; i++)
            {
                if (i % 2 != 0)
                    arr[i] = (arr[i-1] * 2 - 1) % 10007;
                else
                    arr[i] = (arr[i-1] * 2 + 1) % 10007;

            }
            System.out.println(arr[n]);
        }



    }
}
