import java.util.*;
import java.io.*;

public class baekjoon_24479_250131 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int []visited;
    static int sequence = 0;
    static void dfs(int node)
    {

        Collections.sort(graph.get(node));
        visited[node] = ++sequence;

        for(int next: graph.get(node))
        {
            if(visited[next] == 0)
                dfs(next);
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new int[N+1];

        for(int i =0 ; i<=N ; i++)
        {
            graph.add(new ArrayList<>());
        }


        for(int i = 0; i< M ; i++)
        {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        dfs(R);

        for(int i = 1; i <= N; i++)
            System.out.println(visited[i]);
    }
}
