import java.util.Scanner;

public class baekjoon_5358_240526 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while( true ){
            String name = scanner.nextLine();

            if(name == null)
                break;

            char a;
            for(int j = 0 ; j < name.length(); j++){

                a = name.charAt(j);
                if(a == 'i')
                    a = 'e';
                else if(a=='e')
                    a = 'i';
                else if(a=='I')
                    a = 'E';
                else if(a=='E')
                    a = 'I';

                System.out.print(a);

            }
            System.out.println();
        }


    }
}
