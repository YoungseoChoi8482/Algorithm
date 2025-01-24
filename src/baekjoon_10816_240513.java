import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class baekjoon_10816_240513 {
    private static int lowerBound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length;
        while(lo < hi){
            int mid = lo + ((hi - lo)/2);

            if(key <= arr[mid]){
                hi = mid;
            }
            else {
                lo = mid +1;
            }
        }
        return lo;
    }
    private static int upperBound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length;
        while(lo < hi){
            int mid = lo + ((hi-lo)/2);

            if(key < arr[mid])
            {
                hi = mid;
            }
            else {
                lo = mid+1;
            }

        }
        return lo;

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] s_arr = new int[n];
       StringTokenizer st = new StringTokenizer(br. readLine()," ");
       for( int i = 0 ; i < n ; i++){
            s_arr[i] = Integer.parseInt(st.nextToken());
       }

       int n2 = Integer.parseInt(br.readLine());
       st = new StringTokenizer(br.readLine()," ");
       StringBuilder sb = new StringBuilder();
       Arrays.sort(s_arr);

       for ( int i = 0 ; i < n2 ; i++){
           int key = Integer.parseInt(st.nextToken());

           sb.append(upperBound(s_arr,key) - lowerBound(s_arr,key)).append(' ');
       }


       System.out.println(sb);

    }

}
