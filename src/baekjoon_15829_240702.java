import java.util.Scanner;

public class baekjoon_15829_240702 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String alpha = scanner.next();

        long count = 0;  // 결과를 저장할 변수 (오버플로우 방지)
        int prime = 31;  // 문제에서 제시된 소수
        long mod = 1234567891;  // 문제에서 제시된 모듈러 값

        for(int i = 0; i < n ; i++)
        {
            int a = alpha.charAt(i) - 'a' + 1;  // 문자의 값을 계산
            count = (count + a * pow(prime, i, mod)) % mod;
        }

        System.out.println(count);

    }

    // 지수 계산을 위한 함수 (모듈러 연산 포함)
    public static long pow(int base, int exp, long mod) {
        long result = 1;
        long b = base;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            exp >>= 1;
        }

        return result;
    }
}
