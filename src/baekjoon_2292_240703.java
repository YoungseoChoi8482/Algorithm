import java.util.Scanner;
public class baekjoon_2292_240703 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int n = scanner.nextInt();
        int range = 2;
        if(n == 1)
            System.out.println(1);

        else {
            while (range<=n)
            {
                range = range + (6 * count);
                count++;

            }

            System.out.print(count);
        }
    }
}
