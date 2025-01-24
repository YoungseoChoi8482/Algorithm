import java.util.Scanner;

public class baekjoon_4504_240524 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while(true){
            int m = scanner.nextInt();
            scanner.nextLine();
            if(m == 0)
                break;
            if(m % n == 0)
                System.out.println(m + " is a multiple of "+n + ".");
            else
                System.out.println(m + " is NOT a multiple of "+n + ".");

        }
    }
}
