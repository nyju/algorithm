package string;

import java.util.Scanner;

public class String_10_2 {

    // # 문자와 오른쪽에서부터 떨어진 거리와 왼쪽으로부터 떨어진 거리를 비교하는 방법
    // 배열을 생성하고, p에 임의로 큰 숫자 선언
    // 해당 문자가나오면 0, 그렇지않으면 p에서 1 증가
    // 오른쪽, 왼쪽 시작한 값을 비교하여 최소값을 출력
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String_10_2 T = new String_10_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }

}
