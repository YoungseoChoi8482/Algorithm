import java.util.Scanner;
public class baekjoon_4562_240510 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if(num1 < num2){
                System.out.println("NO BRAINS");

            }
            else
                System.out.println("MMM BRAINS");
        }

    }
}
