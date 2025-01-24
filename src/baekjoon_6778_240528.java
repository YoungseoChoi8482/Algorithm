import java.util.Scanner;

public class baekjoon_6778_240528 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int antenna = scanner.nextInt();
        scanner.nextLine();

        int eye = scanner.nextInt();
        scanner.nextLine();

        if(antenna >= 3 && eye <= 4)
            System.out.println("TroyMartian");
        if(antenna <= 6 && eye >= 2)
            System.out.println("VladSaturnian");
        if(antenna <= 2 && eye <= 3)
            System.out.println("GraemeMercurian");

    }
}
