import java.util.Scanner;
public class baekjoon_2525_240607 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int plus = scanner.nextInt();

        m += plus;
        if(m > 59)
        {
            h += m/60;
            m = m%60;
        }

        if(h > 23)
            h = h %24;

        System.out.println(h + " " + m);
    }

}
