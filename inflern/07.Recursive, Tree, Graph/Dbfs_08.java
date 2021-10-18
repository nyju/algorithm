package dfs.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Dbfs_08 {

    int answer = 0; // 최소횟수
    int[] dis = {1, -1, 5}; // 전진 칸수
    int[] ch; // 체크배열 queue에 한번만 들어가도록
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {

        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                int x = Q.poll();

                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx == e) return L + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Dbfs_08 T = new Dbfs_08();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
