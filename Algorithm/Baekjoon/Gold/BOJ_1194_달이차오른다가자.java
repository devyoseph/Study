import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    // 최소경로 문제: BFS
    static Queue<int[]> q = new LinkedList<int[]>();

    static void bfs(int N, int M, char[][] map, int[][][] visit) {
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        String KEY = "abcdef";
        String DOOR = "ABCDEF"; // 문자열 저장

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int r = now[0];
            int c = now[1];
            int S = now[2];
            int key = now[3];

            if (map[r][c] == '1') { // 1의 위치하면 즉시 답을 호출
                System.out.println(S);
                return;
            } else if (KEY.contains(String.valueOf(map[r][c]))) {
                key = key | 1 << KEY.indexOf(map[r][c]);
            }
            // System.out.println(r+" "+c+" "+S+" "+key);
            for (int k = 0; k < 4; k++) {
                int row = r + dx[k];
                int col = c + dy[k];

                if (row < 0 || row >= N || col < 0 || col >= M) {
                    continue;
                }
                char L = map[row][col];
                if (L == '#' || visit[row][col][key] > 0) {
                    continue;
                }

                // 열쇠를 만나면
                if (DOOR.contains(String.valueOf(L))) {
                    if ((key & 1 << DOOR.indexOf(L)) != 0) {
                        visit[row][col][key] = S + 1;
                        q.add(new int[] { row, col, S + 1, key });
                    }
                } else {
                    visit[row][col][key] = S + 1;
                    q.add(new int[] { row, col, S + 1, key });
                }
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];
        int[][][] visit = new int[N][M][64]; // 2의 6승의 경우의 수에 대한 다차원 배열
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < M; j++) {
                char c = s.charAt(j);
                if (c == '0') {
                    q.add(new int[] { i, j, 0, 0 }); // row, col, 이동경로, 차원(가진 열쇠 수)
                }
                map[i][j] = c;
            }
        }
        bfs(N, M, map, visit);
    }
}