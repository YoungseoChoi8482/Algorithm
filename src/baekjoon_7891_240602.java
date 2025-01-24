import java.util.Scanner;

public class baekjoon_7891_240602 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < N ; i++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();

            System.out.println(a+b);

        }
    }

}
