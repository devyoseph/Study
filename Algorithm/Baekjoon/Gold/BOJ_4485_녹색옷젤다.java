import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // 최소경로 문제: BFS
    static int bfs(int[][] map, int[][] visit, int N) {
        int MIN = Integer.MAX_VALUE;
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };

        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[] { 0, 0, map[0][0] });

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int r = now[0];
            int c = now[1];
            int S = now[2];

            for (int k = 0; k < 4; k++) {
                int row = r + dx[k];
                int col = c + dy[k];

                if (row < 0 || row >= N || col < 0 || col >= N) {
                    continue;
                }

                int addS = map[row][col] + S;
                if (visit[row][col] > addS) {
                    visit[row][col] = addS;
                    q.add(new int[] { row, col, addS });
                }
            }
        }

        return visit[N - 1][N - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int idx = 0;
        while (true) {
            idx++;
            int N = Integer.parseInt(br.readLine());
            if (N == 0)
                break;

            int[][] map = new int[N][N];
            int[][] visit = new int[N][N];
            for (int[] a : visit) {
                Arrays.fill(a, Integer.MAX_VALUE);
            }
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.printf("Problem %d: %d%n", idx, bfs(map, visit, N));
        }
    }
}