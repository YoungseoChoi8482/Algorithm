import java.util.Scanner;
public class baekjoon_2460_240529 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int count = 0;

        for(int i = 0 ; i < 10 ; i++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();

            count -= n;
            count += m;

            if(count > max)
                max = count;

        }
        System.out.println(max);
    }
}
