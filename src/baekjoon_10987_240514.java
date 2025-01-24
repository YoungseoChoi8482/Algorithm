import java.util.Scanner;
public class baekjoon_10987_240514 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.nextLine();
        char temp;
        int count = 0;
        for(int i = 0 ; i < word.length(); i++)
        {
            temp =  word.charAt(i);
            if(temp == 'a'||temp == 'e'|| temp == 'i'||temp=='o' || temp == 'u')
                count++;

        }
        System.out.println(count);
    }
}
