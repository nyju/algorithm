package dfs.app;

import java.util.Scanner;

public class Dbfs_01 {

    // 합이 같은 부분집합

    static int n;
    static int[] arr;
    static int total = 0;
    static boolean flag = false;
    static String answer = "NO";

    public void DFS(int v, int sum) {
        if (flag) return;
        if (total - sum == sum) {
            answer = "YES";
            flag = true;
            return;
        }
        if (v == n) {
            return;
        } else {
            DFS(v + 1, sum + arr[v]);
            DFS(v + 1, sum);
        }
    }


    public static void main(String[] args) {
        Dbfs_01 T = new Dbfs_01();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
