package string;


import java.util.Scanner;


public class String_07_2 {

    // 직접비교하는 법
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length(); 
        
        // 길이를 2를 나눈 값 전까지 비교. 글자길이가 홀수인 것도 마찬가지
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)){ // 앞뒤로 전진
                answer = "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String_07_2 T = new String_07_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
