
import java.io.BufferedReader;
import java. io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baekjoon_10845_240511 {

    static int [] arr = new int [10001];
    static int last = 0;
    static int first = 0;
    private static void push(int x){
        arr[last] = x;
        last++;

    }
    static int pop(){
        if( last - first == 0)
            return -1;
        else
        {
            int p = arr[first];
            first ++;
            return p;
        }
    }
    static int front(){
        if(last - first == 0)
            return -1;
        else
        {
            int p = arr[first];
            return p;
        }
    }

    static int back(){
        if(last - first ==0)
            return -1;
        else {
            int l = arr[last-1];
            return l;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            switch (order) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    int t = pop();
                    System.out.println(t);
                    break;
                case "size":
                    System.out.println(last-first);
                    break;
                case "empty":
                    if (last - first == 0)
                        System.out.println("1");
                    else
                        System.out.println("0");
                    break;
                case "front":
                    int k = front();
                    System.out.println(k);
                    break;
                case "back":
                    int l = back();
                    System.out.println(l);
                    break;

            }

        }

    }
}
