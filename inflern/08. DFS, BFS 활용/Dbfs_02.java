package dfs.app;

import java.util.Scanner;

public class Dbfs_02 {

    // 바둑이승차 DFS
    static int c, n, tmp = 0;
    static int arr[];

    public void DFS(int v, int sum) {
        if (sum <= c && tmp < sum) {
            tmp = sum;
        }

        if (v == n) {
            return;
        } else {
            DFS(v + 1, sum + arr[v + 1]);
            DFS(v + 1, sum);
        }
    }

    public static void main(String[] args) {
        Dbfs_02 T = new Dbfs_02();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();

        arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = kb.nextInt();
        }

        T.DFS(0, 0);
        System.out.println(tmp);
    }
}
