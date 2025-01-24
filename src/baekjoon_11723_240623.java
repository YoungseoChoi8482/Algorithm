import java.io.*;
import java.util.*;

// 비트마스킹 문제인줄 모르고 풀다가 실패.
public class baekjoon_11723_240623 {
    public static void check(Set<Integer> set, int k) {
        System.out.println(set.contains(k) ? 1 : 0);
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> allSet = new HashSet<>();

        for (int i = 1; i <= 20; i++) {
            allSet.add(i);
        }

       for(int i = 0; i < m; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           String order = st.nextToken();
           int num = 0;
           if(st.hasMoreTokens())
               num = Integer.parseInt(st.nextToken());

           switch(order){
               case "add":
                   set.add(num);
                   break;

               case "check":
                   check(set,num);
                   break;

               case "remove":
                   set.remove(num);
                   break;

               case  "toggle":
                   if(set.contains(num))
                       set.remove(num);
                   else
                       set.add(num);
                   break;

               case "all":
                   set = new HashSet<>(allSet);
                   break;

               case "empty":
                   set.clear();
                   break;

           }

       }




    }
}
