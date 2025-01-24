import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon_2490_240526 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for(int i = 0; i < 3; i++){
           String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int count = 0;
          while(st.hasMoreTokens()) {
               if (st.nextToken().equals("0"))
                   count++;
           }
           switch(count){
               case 1:
                   System.out.println("A");
                   break;
               case 2:
                   System.out.println("B");
                   break;
               case 3:
                   System.out.println("C");
                   break;
               case 4:
                   System.out.println("D");
                   break;
               default:
                   System.out.println("E");
           }
        }
    }
}
