import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;


public class baekjoon_11866_240518 {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first_line = br.readLine();
        StringTokenizer st = new StringTokenizer(first_line);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= N ; i++){
            q.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(q.size()>1){

            for(int i = 0 ; i < K-1; i++){
                q.offer(q.poll());

            }

            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }
}
