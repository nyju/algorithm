package dfs.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Dbfs_13 {

    // 정접의 갯수가 많을때는 ArrayList 로 한다.
    
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int r) {

        if (r == n) answer++;
        else {
            for (int nr : graph.get(r)) {
                if (ch[nr] == 0) {
                    ch[nr] = 1;
                    DFS(nr);
                    ch[nr] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {

        Dbfs_13 T = new Dbfs_13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);

    }
}
