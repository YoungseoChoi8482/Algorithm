import java.util.Scanner;
import java.util.Arrays;
public class baekjoon_2587_240604 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [] a = new int[5];
        int sum = 0;
        for( int i = 0; i < 5 ; i++){
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);

        System.out.println(sum/5);
        System.out.println(a[2]);

    }
}
