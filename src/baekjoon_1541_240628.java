import java.util.*;
import java.io.*;
// chat gpt에 답이 있다. 반드시 복습 필요.
public class baekjoon_1541_240628 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        // '-'로 수식을 나누고 각 부분을 따로 처리합니다.
        String[] subtractedParts = expression.split("-");
        int result = 0;

        // 첫 번째 부분(첫 번째 '-' 이전)을 처리합니다.
        String[] initialParts = subtractedParts[0].split("\\+");
        for (String part : initialParts) {
            result += Integer.parseInt(part);
        }

        // 나머지 부분(첫 번째 '-' 이후)을 처리합니다.
        for (int i = 1; i < subtractedParts.length; i++) {
            String[] additionParts = subtractedParts[i].split("\\+");
            for (String part : additionParts) {
                result -= Integer.parseInt(part);
            }
        }

        System.out.println(result);
    }
}

