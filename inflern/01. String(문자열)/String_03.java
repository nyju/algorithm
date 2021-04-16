package string;

import java.util.Arrays;
import java.util.Scanner;

public class String_03 {

    public void solution(String val) {
        int longVal = 0;
        int longInx = 0;
        String[] arr = val.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longVal){
                longInx = i;
                longVal= arr[i].length();
            }
        }
        System.out.println(arr[longInx]);
    }

    public static void main(String[] args) {
        String_03 T = new String_03();
        Scanner in = new Scanner(System.in);

        String val = in.nextLine();
        T.solution(val);

        return;
    }
}
