import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Shark { // 객체를 만들고 map 배열과 리스트를 따로 만들어 매핑방식으로 구현
    // 죽음 = 논리 삭제로 진행
    int row, col, s, d, z, i;
    boolean death;

    // 샤크 객체
    public Shark(int row, int col, int s, int d, int z, int i, boolean death) {
        super();
        this.row = row;
        this.col = col;
        this.s = s;
        this.d = d;
        this.z = z;
        this.i = i;
        this.death = death;
    }
}

public class Main {
    static int R, C, M, SUM = 0;
    static Shark[] arr;
    static Shark[][] map;

    // 시뮬레이터: 물고기를 잡기 -> 물고기 이동
    static void simulate() {
        for (int i = 0; i < C; i++) {

            fishing(arr, i);
            move(arr);
        }
    }

    // 2차원 배열에서 잡은 다음, 해당하는 index의 고기를 죽임, 2차원배열에서 삭제
    static void fishing(Shark[] arr, int col) {
        for (int i = 0; i < R; i++) {
            if (map[i][col] != null) {
                SUM += map[i][col].z;
                arr[map[i][col].i].death = true;
                map[i][col] = null;
                i = R;
            }
        }
    }

    // 리스트를 기준으로 원래 map에 있던 물고기들을 지우고 움직인 다음 재배치
    static void move(Shark[] arr) {
        // 가로 주기 2C-2, 세로 주기 : 2R-2
        for (int i = 0; i < M; i++) {
            if (arr[i].death)
                continue;

            int row = arr[i].row;
            int col = arr[i].col;
            map[row][col] = null;
            int s = arr[i].s;
            int net = 0;
            // System.out.println("1: "+Arrays.toString(arr.get(i)));
            switch (arr[i].d) {
                case 1: // 위 , 아래 오 왼
                    net = (s + 2 * R - 2 - row) % (2 * R - 2);
                    if (net > R - 1) {
                        row = 2 * R - 2 - net;
                        arr[i].d = 1;
                    } else {
                        row = net;
                        arr[i].d = 2;
                    }
                    break;
                case 2:
                    net = (s + row) % (2 * R - 2);
                    if (net > R - 1) {
                        row = 2 * R - 2 - net;
                        arr[i].d = 1;
                    } else {
                        row = net;
                        arr[i].d = 2;
                    }
                    break;
                case 3:
                    net = (s + col) % (2 * C - 2);
                    if (net > C - 1) {
                        col = 2 * C - 2 - net;
                        arr[i].d = 4;
                    } else {
                        col = net;
                        arr[i].d = 3;
                    }
                    break;
                case 4:
                    net = (s + 2 * C - 2 - col) % (2 * C - 2);
                    if (net > C - 1) {
                        col = 2 * C - 2 - net;
                        arr[i].d = 4;
                    } else {
                        col = net;
                        arr[i].d = 3;
                    }
                    break;
            }
            arr[i].row = row;
            arr[i].col = col;
        }

        for (int i = 0; i < M; i++) {
            if (arr[i].death) {
                continue;
            }
            int row = arr[i].row;
            int col = arr[i].col;
            if (map[row][col] == null) {
                map[row][col] = arr[i];
            } else if (map[row][col].z < arr[i].z) {
                arr[map[row][col].i].death = true;
                map[row][col] = arr[i];
            } else {
                arr[i].death = true;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new Shark[M];
        map = new Shark[R][C];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken()) - 1;
            int col = Integer.parseInt(st.nextToken()) - 1;
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            Shark shark = new Shark(row, col, s, d, z, i, false);

            arr[i] = shark;
            map[row][col] = shark;
        }
        simulate();
        System.out.println(SUM);
    }
}