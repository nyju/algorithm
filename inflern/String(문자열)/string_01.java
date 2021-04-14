package string;

import java.util.Scanner;

public class string_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value1 = in.next(); // 문자열
        if (value1.length() > 100) {
            return;
        }
        String value2 = in.next(); // 문자


        int cnt = 0;
        int length = value1.length();

        for (int i = 0; i < value1.length(); i++) {
            if (value2.equalsIgnoreCase(value1.substring(i, i + 1))) {
                cnt++;
            }
        }

        System.out.println(cnt);
        return;
    }

}
