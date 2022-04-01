import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    // 최소경로 문제: BFS
    static int map[][], visit[][][];
    static int min = Integer.MAX_VALUE; // 최소값을 저장할 변수
    static boolean arrived = false; // 한 번이라도 도착했는지 판단 여부

    static void bfs(int H, int W, int K) {
        int[] dx = { 0, 0, -1, 1, 1, 1, -1, -1, 2, 2, -2, -2 };
        int[] dy = { -1, 1, 0, 0, 2, -2, 2, -2, 1, -1, 1, -1 };
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[] { 0, 0, 0, K });
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int r = now[0];
            int c = now[1];
            int S = now[2];
            if (r == H - 1 && c == W - 1) { // 제자리에 있을 때 답은 0이 되어야하므로
                System.out.println(S); // 맨 뒤가 아니라 앞에서 체크해줘야 0을 출력 가능하다(아니면 -1 출력)
                return;
            }
            int jump = now[3];

            // System.out.println(r+" "+c+" "+S+" "+jump);
            for (int k = 0; k < 12; k++) {
                if (k == 4 && jump <= 0) {
                    k = 12;
                    continue;
                } else if (k == 4 && jump > 0) {
                    jump--;
                }
                int row = r + dx[k];
                int col = c + dy[k];

                if (row < 0 || row >= H || col < 0 || col >= W) {
                    continue;
                }
                if (map[row][col] == 1 || visit[row][col][jump] > 0) {
                    continue;
                }
                visit[row][col][jump] = S + 1;
                q.add(new int[] { row, col, S + 1, jump });
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        map = new int[H][W];
        visit = new int[H][W][K + 1]; // K는 말을 사용한 횟수
        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(H, W, K);
    }
}