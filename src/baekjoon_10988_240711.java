import java.util.Scanner;

// 팰린드롬인지 확인하기. 문자열을 stringTokenizer로 바꾸기 보다 charAt를쓸줄 알아야한다.
// boolean 형을 잘 사용해보자.

public class baekjoon_10988_240711 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        boolean isPalindrome = true;

        for(int i = 0; i < first.length()/2;i++)
        {
            if(first.charAt(i) != first.charAt(first.length() - 1 -i))
            {
                isPalindrome = false;
                break;
            }

        }

        if(isPalindrome)
            System.out.println(1);
        else
            System.out.println(0);

    }
}
