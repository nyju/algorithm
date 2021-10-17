package string;

import java.util.Scanner;

public class String_10 {

    public void solution(String str, char c) {

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int j = 0;
            while(true){
                int y = i +j;
                int z = i -j;

                if(y >= arr.length) y = arr.length -1;
                if(z < 0) z = 0;

                if( c == arr[y]){
                   System.out.print(j + " ");
                    j++;
                    break;
                }
                else if( c == arr[z]){
                   System.out.print(j + " ");
                    j++;
                    break;
                }
                j++;
            }
        }



        /*char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            char a = arr[i];
            int min = 101;
            for (int j = 0; j < arr.length; j++) {
                if (c == arr[j]) {
                    if (min > Math.abs(j - i)) min = Math.abs(j - i);
                }
            }
            System.out.print(min + " ");
        }*/
    }


    public static void main(String[] args) {
        String_10 T = new String_10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c= kb.next().charAt(0);

        T.solution(str, c);
    }
}
