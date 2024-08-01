import java.util.Scanner;

public class baekjoon_1427_240801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        int[] arr = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            arr[i] = Integer.parseInt(num.substring(i, i + 1));
        }


        for (int i = 0; i < num.length(); i++) {
            int max = i;
            for (int j = i; j < num.length(); j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }

            }

            if(max > i)
            {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
        for(int i = 0 ; i < num.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}
