import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class baekjoon_2164_240512 {
    private static int[] arr = new int[5000001];
    private static int first = 0;
    private static int last = 0;

    public static void pop(){
        first++;
    }

    public static void move(){

        arr[last] = arr[first];

        first++;
        last ++;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int temp = 1;

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = temp;
            temp++;
            last++;
        }

        while(last-first > 1){

            pop();
            move();

        }
        System.out.println(arr[first]);
    }

}
