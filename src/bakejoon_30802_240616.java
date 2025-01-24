import java.util.Scanner;

public class bakejoon_30802_240616 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int [] arr = new int[6];
        for(int i = 0; i < 6; i++)
            arr[i] = scanner.nextInt();
        int T = scanner.nextInt();
        int P = scanner.nextInt();

        int T_count = 0;

        for(int i = 0 ; i < 6; i++)
        {
           T_count += arr[i] /T;
            if (arr[i] % T != 0)
                T_count++;
            }
        System.out.println(T_count);
        System.out.print((N/P) + " "+ N %P);

    }
}
