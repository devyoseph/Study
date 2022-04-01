import java.util.*;

public class Main {
    // 최소경로 문제: BFS
    static char map[][];
    static int visit[][];

    static Queue<int[]> q = new LinkedList<int[]>(); // 1 물, 2 고슴도치, 3 장애물

    static void bfs(int R, int C) {
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };

        while (!q.isEmpty()) {
            // System.out.println("=========");
            // for(char[] a : map) {
            // System.out.println(Arrays.toString(a));
            // }

            int[] now = q.poll();
            int type = now[0]; // 물이면 1 고슴도치면 2
            int r = now[1];
            int c = now[2];
            int S = now[3]; // 현재까지 움직인 거리
            // System.out.println(type+" "+r+" "+c);
            switch (type) {

                case 1:
                    for (int k = 0; k < 4; k++) {
                        int row = r + dx[k];
                        int col = c + dy[k];

                        if (row < 0 || row >= R || col < 0 || col >= C) {
                            continue;
                        }

                        if (map[row][col] == '.') {
                            map[row][col] = '*';
                            q.add(new int[] { 1, row, col, S + 1 });
                        }

                    }
                    break;

                case 2:
                    if (map[r][c] == 'D') { // 고슴도치 (2)가 굴에 도달
                        System.out.println(S);
                        return;
                    }
                    for (int k = 0; k < 4; k++) {
                        int row = r + dx[k];
                        int col = c + dy[k];

                        if (row < 0 || row >= R || col < 0 || col >= C) {
                            continue;
                        }

                        if (map[row][col] == '*' || map[row][col] == 'X') {
                            continue;
                        }

                        if (visit[row][col] > 0)
                            continue;

                        visit[row][col] = S + 1;
                        q.add(new int[] { 2, row, col, S + 1 });
                    }
                    break;
            }

        }

        System.out.println("KAKTUS");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        map = new char[R][C];
        visit = new int[R][C];
        int gR = 0;
        int gC = 0;
        for (int i = 0; i < R; i++) {
            String s = sc.next();
            for (int j = 0; j < C; j++) {
                char c = s.charAt(j);
                if (c == '*') {
                    map[i][j] = c;
                    q.add(new int[] { 1, i, j, 0 }); // 물 시작
                } else if (c == 'S') {
                    gR = i;
                    gC = j; // 고슴도치는 제일 나중에 넣어줘야함
                    map[i][j] = '.';
                } else {
                    map[i][j] = c;
                }
            }
        }
        q.add(new int[] { 2, gR, gC, 0 }); // 고슴도치 시작
        bfs(R, C);
    }
}