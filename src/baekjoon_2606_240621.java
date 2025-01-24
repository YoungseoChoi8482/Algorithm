import java.util.*;
import java.io.*;

public class baekjoon_2606_240621 {
    public static int [][] node;
    public static boolean[] visited;
    public static int M,N;
    public static int result = 0;

    public static void dfs(int x){
        visited[x] = true;
        result += 1;

        for(int i = 1 ; i <= M ; i++){
            if(node[x][i] == 1 && !visited[i])
                dfs(i);
        }
    }
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
         M = scanner.nextInt();
         N = scanner.nextInt();

        node = new int[M+1][M+1];

        visited = new boolean[M+1];

        for(int i = 0; i < N; i++){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            node[m][n] = node[n][m] = 1;
        }

        dfs(1);

        System.out.println(result-1);








    }
}
