import java.util.Scanner;

public class baekjoon_4892_240530 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(true){
            int n = scanner.nextInt();
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            scanner.nextLine();
            if(n == 0)
                break;

            n1 = 3 * n;
            if( n1 % 2==0)
                n2 = n1 / 2;
            else
                n2 = (n1 + 1) / 2;

            n3 = 3 * n2;

            n4 = n3 / 9;

            if(n % 2 == 0)
                System.out.println(count + ". even "+n4);
            else
                System.out.println(count + ". odd "+ n4);

            count++;
        }

    }
}
