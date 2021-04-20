package string;


import java.util.Scanner;


public class String_05_2 {

    public void solution(String str) {

        char[] arr = str.toCharArray(); // toCharArray

        int lt = 0;
        int rt = arr.length - 1;

        // lt, rt
        // Character.isAlphabetic
        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) lt++; 
            else if (!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(arr)); // char[] => string
    }

    public static void main(String[] args) {
        String_05_2 T = new String_05_2();
        Scanner in = new Scanner(System.in);

        String str = in.next();
        T.solution(str);

        return;
    }
}
