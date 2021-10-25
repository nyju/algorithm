package dfs.basic;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Dbfs_14 {

    // 그래프최단거리(BFS) Level을 이용하는 방법
    
    static int n, m;
    static int[][] graph;
    static int[] ch;
    static int[] var;

    public void solution() {

        Queue<Integer> Q = new LinkedList<>();
        Q.offer(1);
        ch[1] = 1;
        int lev = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 1; i <= len; i++) {
                int x = Q.poll();
                var[x] = lev;
                for (int j = 1; j <= n; j++) {
                    if (graph[x][j] == 1 && ch[j] == 0) {
                        Q.offer(j);
                        ch[j] = 1;
                    }

                }
            }
            lev++;
        }


    }

    public static void main(String[] args) {

        Dbfs_14 T = new Dbfs_14();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        var = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        T.solution();

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + var[i]);
        }
    }
}
