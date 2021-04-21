package string;


import java.util.Scanner;


public class String_06_2 {

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));

            // i와 str.indexOf(str.charAt(i)) 가 다르면 중복된 문자!
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String_06_2 T = new String_06_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
