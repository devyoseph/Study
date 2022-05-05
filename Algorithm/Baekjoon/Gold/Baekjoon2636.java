import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int cheese = 0; // 남은 치즈의 개수

    static void bfs(int N, int M, int[][] map, int[][] visit) {
        Queue<int[]> q = new LinkedList<>();
        int trial = 0; // 반복문이 돌 때마다 방문체크에 기록하는 수는 커집니다.
        int last_cheese = cheese; // 답으로 출력할 마지막 치즈의 값

        // 방향 배열
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { -1, 1, 0, 0 };

        while (true) {
            // 경계선값을 매 반복문마다 추가(공기의 출발점)
            trial++;
            for (int i = 0; i < N; i++) {
                q.add(new int[] { i, 0, trial }); // 왼쪽 열 원소들 추가, trial 기록
                q.add(new int[] { i, M - 1, trial }); // 오른쪽 열
                visit[i][0] = trial; // 방문 체크
                visit[i][M - 1] = trial;
            }
            for (int j = 0; j < M; j++) {
                q.add(new int[] { 0, j, trial }); // 맨 위쪽 행
                q.add(new int[] { N - 1, j, trial }); // 맨 아래쪽 행
                visit[0][j] = trial; // 방문체크
                visit[N - 1][j] = trial;
            }

            while (!q.isEmpty()) {
                int[] now = q.poll();
                int r = now[0];
                int c = now[1];
                int t = now[2];

                for (int k = 0; k < 4; k++) {
                    int row = r + dx[k];
                    int col = c + dy[k];

                    if (row < 0 || row >= N || col < 0 || col >= M) {
                        continue; // 경계값 조건
                    }

                    if (visit[row][col] >= trial)
                        continue; // 이미 방문한 곳이라면 스킵

                    visit[row][col] = trial; // 방문체크

                    if (map[row][col] == 1) { // 만약 map에서 치즈 부분이면 치즈 지워주기
                        map[row][col] = 0;
                        cheese--;
                    } else {
                        q.add(new int[] { row, col, trial });
                    }
                }
            }

            if (cheese == 0) {
                System.out.println(trial);
                System.out.println(last_cheese); // 치즈 개수가 0이되었다면 이전 치즈 개수 반환
                return;
            } else {
                last_cheese = cheese; // 치즈 개수가 0이 아니라면 현재 치즈 개수를 저장
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        int[][] visit = new int[N][M]; // int 배열로 방문체크 배열 생성

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int v = Integer.parseInt(st.nextToken());
                if (v == 1)
                    cheese++; // 1이라면 치즈 개수에 추가합니다.
                map[i][j] = v;
            }
        }

        bfs(N, M, map, visit); // bfs에 값들을 집어넣습니다.
    }
}
