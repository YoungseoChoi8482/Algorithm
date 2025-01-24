import java.util.Scanner;
public class baekjoon_3004_240601 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int answer = ((N/2)+1) *(N-(N/2)+1);
        System.out.println(answer);

    }
}
