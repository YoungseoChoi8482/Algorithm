import java.util.Scanner;
import java.util.Arrays;
// if문 조건을 잘 생각해서 중첩된 부분이 없는지 확인하자.

public class baekjoon_2476_240713 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxPrize = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int[] arr = {a, b, c};
            Arrays.sort(arr);

            int prize;
            if (a == b && b == c) {
                prize = 10000 + (a * 1000);
            } else if (a == b || b == c || a == c) {
                if (a == b || a == c) {
                    prize = 1000 + (a * 100);
                } else {
                    prize = 1000 + (b * 100);
                }
            } else {
                prize = arr[2] * 100;
            }

            if (prize > maxPrize) {
                maxPrize = prize;
            }
        }

        System.out.println(maxPrize);
        scanner.close();
    }
}
