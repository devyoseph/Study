dx = [1,-1,0,0]
dy = [0,0,1,-1] # 상하좌우 검색용 좌표
for t in range(int(input())):
    n = int(input())
    lst = []
    cnt = 0
    answer = []
    check = [[False for i in range(n)] for j in range(n)]

    for l in range(n): # 값 집어넣기
        lst.append(list(map(int,input().split())))

    def dfs(row, col): # 재귀를 통해 연결된 구역들 표시
        if row < 0 or row >= n or col < 0 or col >= n or lst[row][col] ==0 or check[row][col]:
            return # 경계값을 벗어나면 종료

        check[row][col] = True # 방문 체크

        for direction in range(4): # 상하좌우 검색
            dfs(row+dx[direction],col+dy[direction])

    def getlegth(row,col): # 현재 사각형의 최대 길이를 구하는 메소드
        row_max = row
        col_max = col
        while row_max < n:
            if lst[row_max][col] == 0:
                break
            row_max += 1
        while col_max < n:
            if lst[row][col_max] == 0:
                break
            col_max += 1
        return row_max,col_max

    def recIn(row,col,row_max,col_max): # 내부가 온전한 사각형인지 구하는 메소드
        for i in range(row,row_max):
            for j in range(col,col_max):
                if lst[i][j] == 0:
                    return False
        return True

    def recOut(row,col,row_max,col_max): # 외부가 0인지 확인해주는 메소드
        if row-1 >= 0: # 위쪽 경계 체크
            for j in range(col,col_max):
                if lst[row-1][j] != 0:
                    return False
        if row_max <= n-1: # 아래쪽 경계
            for j in range(col,col_max):
                if lst[row_max][j] != 0:
                    return False
        if col-1 >= 0: # 왼쪽 경계
            for i in range(row,row_max):
                if lst[i][col-1] != 0:
                    return False
        if col_max <= n-1: # 오른쪽 경계
            for i in range(row,row_max):
                if lst[i][col_max] != 0:
                    return False

        return True

    for i in range(n): # 배열 전체탐색
        for j in range(n):
            if lst[i][j] != 0 and not check[i][j]:
                dfs(i,j)
                row_max, col_max = getlegth(i,j)
                if recIn(i,j,row_max,col_max) and recOut(i,j,row_max,col_max):
                    cnt += 1
                    answer.append([row_max-i,col_max-j])

		# 답 출력하는 곳
    answer.sort(key=lambda x: x[0]) # 먼저 행으로 정렬 후
    answer.sort(key=lambda x:x[0]*x[1]) # 넓이로 정렬
    dap = ''
    for i in answer:
        for j in i:
            dap += str(j) + ' '
    print(f'#{t+1} {cnt} {dap}')
