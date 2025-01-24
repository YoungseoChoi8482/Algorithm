import java.util.*;
import java.io.*;

//아예 큰값으로 초기화를 해놓고 시작하는것도 좋은 방법이다.
// Arrays.fill 문법을 참고하자
//math.min은 사용할때가 많으니 유의해두자. 같은걸 또다른 조건에서 비교할 때 유용하게 쓰인다.
// 3kg 하고 5kg이 조건이니 이 값을 무조건 사용한다고 생각하면 된다.

public class baekjoon_2839_240706 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 큰 값으로 초기화 (최대 N을 3kg으로만 채울 때의 봉지 수)
        int[] arr = new int[N + 1];
        Arrays.fill(arr, 5000);  // 임의의 큰 수로 초기화

        // 초기값 설정
        arr[0] = 0;

        // 배열 채우기
        for (int i = 3; i <= N; i++) {
            if (i >= 3) arr[i] = Math.min(arr[i], arr[i - 3] + 1);
            if (i >= 5) arr[i] = Math.min(arr[i], arr[i - 5] + 1);
        }

        // 결과 출력
        if (arr[N] >= 5000)
            System.out.println(-1);
        else
            System.out.println(arr[N]);
    }
}
