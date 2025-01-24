import java.util.Scanner;

public class baekjoon_2857_240605 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int []count = new int[5];
        for(int i = 0; i < 5; i++){
            String str = scanner.nextLine();
            if(str.contains("FBI"))
                count[i]++;

        }
        int real = 0;
        for(int i = 0; i < count.length ; i++)
        {
            if(count[i] != 0) {
                System.out.print((i + 1) + " ");
                real++;
            }
        }
        if(real == 0)
            System.out.println("HE GOT AWAY!");

    }

}
