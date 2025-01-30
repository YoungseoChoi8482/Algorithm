import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon_24480_250130 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int [] visited;
    static int sequence = 0;

    static void dfs(int node){
        visited[node] = ++sequence;

        Collections.sort(graph.get(node), Comparator.reverseOrder());

        for(int next: graph.get(node))
        {
            if(visited[next] == 0)
                dfs(next);//재귀 호출

        }
    }


    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new int[N+1];

        for(int i = 0; i <= N ; i++)
        {
            graph.add(new ArrayList<>()); //graph리스트를 생성했지만 각 노드에 대한 리스트도 초기화해줘야함.
        }

        for(int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }



        dfs(R);

        for(int i = 1 ; i <=N ; i++)
        {
            System.out.println(visited[i]);
        }


    }
}
