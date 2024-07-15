import java.util.Scanner;
public class baekjoon_1267_240527 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int count_y= 0;
        int count_m = 0;

        for(int i = 0; i < n ; i++){
            int k = scanner.nextInt();

            count_y += 10 * ((k / 30) + 1);
            count_m += 15 * ((k / 60) + 1);

        }
        if(count_y < count_m)
            System.out.println("Y" + " "+ count_y);
        else if(count_y == count_m)
            System.out.println("Y "+ "M "+ count_y);
        else
            System.out.println("M" + " "+ count_m);
    }
}
