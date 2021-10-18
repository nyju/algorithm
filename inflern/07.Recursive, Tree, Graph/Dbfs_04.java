package dfs.basic;

public class Dbfs_04 {

    // 피보나치 재귀 (메모리제이션)
    // 재귀는 스택을 이용 = > 성능 떨어짐
    // 재귀보다 for문을 이용하는 것이 성능이 훨씬 좋다.
    // 배열에 저장하여 값이 있을 경우 비교

    static int[] fibo;

    public int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 2);
    }

    public static void main(String[] args) {
        Dbfs_04 T = new Dbfs_04();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 0; i <= n; i++) {
            System.out.println(fibo[i] + " , ");
        }
    }

}