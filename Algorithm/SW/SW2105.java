import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    static int N, MAX, map[][];
    static int maxNum = 0; // 디저트 종류 중 최대값
    static int[] dx = { -1, 1, 1, -1 };
    static int[] dy = { 1, 1, -1, -1 };

    static boolean check(int r, int c, int w, int h) {
        boolean[] visit = new boolean[maxNum + 1];

        for (int k = 0; k < 4; k++) {
            int value = k % 2 == 0 ? h : w;
            for (int i = 1; i < value; i++) {
                r += dx[k];
                c += dy[k];
                int now = map[r][c];
                if (visit[now])
                    return false;
                visit[now] = true;
            }
        }
        // for(int i=1; i<h; i++) {
        // r += dx[0];
        // c += dy[0];
        // int now = map[r][c];
        // if(visit[now]) return false;
        // visit[now] = true;
        // }
        //
        // for(int i=1; i<w; i++) {
        // r += dx[1];
        // c += dy[1];
        // int now = map[r][c];
        // if(visit[now]) return false;
        // visit[now] = true;
        // }
        //
        // for(int i=1; i<h; i++) {
        // r += dx[2];
        // c += dy[2];
        // int now = map[r][c];
        // if(visit[now]) return false;
        // visit[now] = true;
        // }
        //
        // for(int i=1; i<w; i++) {
        // r += dx[3];
        // c += dy[3];
        // int now = map[r][c];
        // if(visit[now]) return false;
        // visit[now] = true;
        // }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(br.readLine());
            MAX = -1;
            maxNum = 0;

            map = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    int now = Integer.parseInt(st.nextToken());
                    map[i][j] = now;
                    maxNum = Math.max(now, maxNum);
                }
            }

            for (int w = N - 1; w >= 2; w--) {
                for (int h = N + 1 - w; h >= 2; h--) {
                    if (MAX < (w + h) * 2 - 4) {
                        for (int r = 1; r < N - 1; r++) { // 왼쪽 꼭지점 기준: 왼쪽 꼭지점에 대한 조건이 이미 포함
                            for (int c = 0; c < N - 1; c++) {
                                if (r - (h - 1) >= 0 && c + (h - 1) + (w - 1) < N && r + (w - 1) < N) {
                                    if (check(r, c, w, h)) {
                                        MAX = Math.max(MAX, (w + h) * 2 - 4);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("#" + t + " " + MAX);
        }
    }

}