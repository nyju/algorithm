package dfs.app;

import java.util.Scanner;

public class Dbfs_03 {

    // 최대점수 구하기(DFS)
    static int n, m;
    static int[] a, b;
    static int result = 0;

    public void DFS(int v, int score, int sum) {
        if (sum > m) return;
        if (v == n) {
            if (score > result) result = score;
        } else {
            DFS(v + 1, score + a[v + 1], sum + b[v + 1]);
            DFS(v + 1, score, sum);
        }

    }

    public static void main(String[] args) {
        Dbfs_03 T = new Dbfs_03();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        a = new int[n + 1];
        b = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }

        T.DFS(0, 0, 0);
        System.out.println(result);
    }

}
