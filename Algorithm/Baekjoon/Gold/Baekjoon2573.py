import sys
sys.setrecursionlimit(100000)

N, M = map(int, input().split())
arr = []


def dfs(r, c, visit, N, M):
    visit[r][c] = True

    for k in ((0, 1), (0, -1), (1, 0), (-1, 0)):
        row = r + k[0]
        col = c + k[1]

        if row < 0 or row >= N or col < 0 or col >= M:
            continue

        if arr[row][col] == 0 or visit[row][col]:
            continue

        dfs(row, col, visit, N, M)


def count_ice(arr, visit):
    global N, M
    count = 0
    for n in range(N):
        for m in range(M):
            if arr[n][m] > 0 and not visit[n][m]:
                # print("방문", n, m)
                count += 1
                dfs(n, m, visit, N, M)


    return count

def melt(arr):
    global N, M
    record = []

    for n in range(N):
        for m in range(M):
            if arr[n][m] != 0:
                count = 0
                for k in ((0, 1), (0, -1), (1, 0), (-1, 0)):
                    row = n + k[0]
                    col = m + k[1]

                    if row < 0 or row >= N or col < 0 or col >= M:
                        continue
                    if arr[row][col] == 0:
                        count += 1

                if count > 0:
                    record.append([n,m,count])

    for r in record:
        row = r[0]
        col = r[1]
        count = r[2]
        arr[row][col] = 0 if arr[row][col]-count < 0 else arr[row][col]-count

for _ in range(N):
    arr.append(list(map(int, input().split())))

YEAR = 0
flag = False
while True:
    now = count_ice(arr, [[False] * M for _ in range(N)])
    #print(now)
    #pprint(arr)
    if now == 0:
        flag = not flag
        break
    elif now == 1:
        melt(arr)
        YEAR += 1
    else:
        break


if flag:
    print(0)
else:
    print(YEAR)
