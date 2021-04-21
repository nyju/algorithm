package string;


import java.util.Scanner;


public class String_07 {

    public void solution(String str) {

        String val = new StringBuffer(str).reverse().toString();

        if(str.equalsIgnoreCase(val)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
    
    public static void main(String[] args) {
        String_07 T = new String_07();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        T.solution(str);

        return;
    }
}
