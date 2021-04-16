package string;

import java.util.ArrayList;
import java.util.Scanner;

public class String_04 {

    public void solution(ArrayList<String> val) {

        for (int i = 0; i < val.size(); i++) {
            StringBuffer buf = new StringBuffer();

            int len = val.get(i).length();
            for (int j = len - 1; j >= 0; j--) {
                buf.append(val.get(i).charAt(j));
            }

            System.out.println(buf);
        }
    }

    public static void main(String[] args) {
        String_04 T = new String_04();
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        String[] arr = null;
        ArrayList<String> arrs = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            arrs.add(in.next());

        }

        T.solution(arrs);

        return;
    }
}
