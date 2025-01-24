import java.util.Scanner;
import java.util.Arrays;
public class baekjoon_7510_240521 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int [] tri = new int[3];

        for(int i = 0; i < n ; i++){
            tri[0] = scanner.nextInt();
            tri[1] = scanner.nextInt();
            tri[2] = scanner.nextInt();
            scanner.nextLine();
            Arrays.sort(tri);
            String answer;
            if(tri[2] * tri[2] == (tri[0]*tri[0]) + (tri[1] * tri[1]))
                answer = "yes";
            else
                answer = "no";

            System.out.println("Scenario #"+(i+1) + ":");
            System.out.println(answer);
            System.out.println();

        }
    }
}
