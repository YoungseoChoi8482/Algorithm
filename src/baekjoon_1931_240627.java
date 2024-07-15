import java.util.*;
import java.io.*;
// 반드시 복습 필요.

public class baekjoon_1931_240627 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            meetings[i][1] = Integer.parseInt(st.nextToken()); // 끝나는 시간
        }

        // 끝나는 시간 기준으로 정렬 (끝나는 시간이 같으면 시작 시간 기준으로 정렬)
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int count = 0;
        int endTime = 0;

        for (int i = 0; i < N; i++) {
            if (meetings[i][0] >= endTime) {
                count++;
                endTime = meetings[i][1];
            }
        }

        System.out.println(count);
    }
}
