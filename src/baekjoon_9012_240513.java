import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class baekjoon_9012_240513 {
    static String [] stack = new String[51];
    static int top = -1;
    public static void push(String element){
        top++;
        stack[top] = element;
    }

    public static String pop(){
        String element = stack[top];
        top --;
        return element;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0 ; i < n ; i++){
           String order = br.readLine();
           boolean answer = true;
           top = -1;
            for(int j = 0 ; j < order.length(); j++)
            {
                char ch = order.charAt(j);
                if(ch =='(')
                    push("(");
                else if(ch == ')') {
                    if (top == -1 || !stack[top].equals("(")) {
                        answer = false;
                        break;
                    } else {
                        pop();
                    }
                }
            }

           if (top != -1){
               answer = false;
           }
            System.out.println(answer ? "YES":"NO");
        }
    }
}
