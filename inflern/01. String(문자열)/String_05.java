package string;


import java.util.Scanner;


public class String_05 {

    public void solution(String str) {

        String pattern = "^[ㄱ-ㅎ가-힣a-zA-Z0-9]*$";

        int len = str.length();
        String[] arr = new String[len];

        int k2 = len;

        for (int i = 0; i < len; i++) {
            String val = str.substring(i, i + 1);
            if (val.matches(pattern)) { // 한글인 경우
                boolean found = false;
                for (int k = k2 - 1; k >= 0; k--) {
                    String val2 = str.substring(k, k + 1);
                    if (val2.matches(pattern)) { // 한글인 경우
                        arr[i] = val2;
                        arr[k] = val;
                        found = true;
                        k2 = k;
                        break;
                    }
                }
                if (found == false) {
                    arr[i] = val;
                }

            } else { // 특수문자인 경우
                arr[i] = val;
            }
        }

        for (int j = 0; j < len; j++) {
            System.out.print(arr[j]);
        }
    }

    public static void main(String[] args) {
        String_05 T = new String_05();
        Scanner in = new Scanner(System.in);

        String str = in.next();

        T.solution(str);
        return;
    }
}
