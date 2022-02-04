for x in range(10):
    t = int(input())
    ladder = []

    for l in range(100):
        ladder.append(list(map(int, input().split())))

    now = 1  # 위로 이동: 1 왼쪽 이동: 2 오른쪽 이동: 3
    row = 99 # 출발행
    col = ladder[99].index(2) # 출발열

    while row > 0: # 현재 방향에 따라서 분기해 이동
        if now == 1:
            row -= 1

            if col >= 1 and ladder[row][col-1] == 1:
                now = 2
            if col < 99 and ladder[row][col+1] == 1:
                now = 3

        elif now == 2:
            col -= 1
            if ladder[row-1][col] == 1:
                now = 1

        else:
            col += 1
            if ladder[row - 1][col] == 1:
                now = 1

    print(f'#{t} {col}') # row == 0 일 때 col 출력
