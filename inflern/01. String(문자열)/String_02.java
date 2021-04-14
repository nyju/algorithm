package string;

import java.util.Scanner;

public class String_02 {

    public void solution(String value1) {

        for (int i = 0; i < value1.length(); i++) {

            char ch = value1.charAt(i);

            if (Character.isUpperCase(ch) == true) {
                System.out.print(Character.toString(ch).toLowerCase());
            } else {
                System.out.print(Character.toString(ch).toUpperCase());
            }
        }
    }

    public static void main(String[] args) {
        String_02 T = new String_02();
        Scanner in = new Scanner(System.in);

        String value1 = in.next();

        T.solution(value1);
        return;
    }

}
