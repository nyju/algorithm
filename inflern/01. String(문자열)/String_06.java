package string;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class String_06 {

    public void solution(String str) {
        char[] arr = str.toCharArray();
        List list = new ArrayList();

        for (char val : arr) {
            if (!list.contains(val)) {
                list.add(val);
            }
        }

        for (Object c : list) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String_06 T = new String_06();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        T.solution(str);

        return;
    }
}
