import java.util.Scanner;

public class baekjoon_2420_240523 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();

        long m = scanner.nextInt();

        scanner.nextLine();
        long sum = 0;
        sum = n - m;
        if(sum<0)
            sum = -sum;

        System.out.println(sum);

    }
}
