import java.util.Scanner;

public class baekjoon_10808_240522 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String m = scanner.nextLine();
        int [] arr = new int [26];

        for(int i = 0; i < m.length(); i++){

            char a = m.charAt(i);
            int change = (int)a - 97;
            arr[change]++;

        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
