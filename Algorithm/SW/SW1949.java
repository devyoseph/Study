import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    static int MAX = 0;
    static int N, K;
    static int[] dx = { -1, 0, 1, 0 }; // 상우하좌
    static int[] dy = { 0, 1, 0, -1 };

    static void dfs(int i, int j, int[][][] map, int S, boolean[][] visit) {
        visit[i][j] = true;
        int now = map[i][j][0];
        for (int k = 0; k < 4; k++) {
            int row = i + dx[k];
            int col = j + dy[k];
            if (row < 0 || row >= N || col < 0 || col >= N) {
                continue;
            }
            if (visit[row][col])
                continue;
            if (now <= map[row][col][0])
                continue;

            MAX = Math.max(MAX, S + 1);
            dfs(row, col, map, S + 1, visit);
        }
        visit[i][j] = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            MAX = 0;
            ArrayList<int[]> arr = new ArrayList<>(); // 최대 높이 보관하는 곳

            int max = 0;
            int idx = 0;
            int[][][] map = new int[N][N][2]; // 맵

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    int v = Integer.parseInt(st.nextToken());
                    map[i][j][0] = v;

                    if (v > max) { // 최대값보다 크면 비우고 등록
                        map[i][j][1] = 0;
                        idx = 1;
                        arr.clear();
                        max = v;
                        arr.add(new int[] { i, j });

                    } else if (v == max) { // 같으면 후보에 추가
                        arr.add(new int[] { i, j });
                        map[i][j][1] = idx;
                        idx++;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int not = -1;
                    if (map[i][j][0] == max) {
                        not = map[i][j][1];
                    }

                    for (int k = 1; k <= K; k++) { // 0을 깎을 필요는 없다
                        map[i][j][0] -= k;
                        // System.out.println("####"+k);
                        for (int d = 0; d < arr.size(); d++) {
                            if (d == not)
                                continue;
                            dfs(arr.get(d)[0], arr.get(d)[1], map, 1, new boolean[N][N]);
                        }
                        map[i][j][0] += k;
                    }
                }
            }
            System.out.println("#" + t + " " + MAX);
        }
    }

}