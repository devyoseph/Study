bingo = []
for i in range(5):
    bingo.append(list(map(int,input().split())))

call = []
for i in range(5):
    call.extend(list(map(int,input().split())))

# 숫자를 넣으면 숫자 위치를 찾고 그 숫자를 기준으로 빙고가 만들어지는지 판별
def check(number):
    row = col = 0
    for i in range(5):
        for j in range(5):
            if number == bingo[i][j]:
                bingo[i][j] = 0
                row, col = i, j
                break
    garo = sero = 1
    for i in range(5):
        if bingo[row][i] != 0:
            sero = 0
            break
    for j in range(5):
        if bingo[j][col] != 0:
            garo = 0
            break
    daegack = 0
    if row == col:
        daegack += 1
        for i in range(5):
            if bingo[i][i] != 0:
                daegack -= 1
                break
    if row + col == 4:
        daegack += 1
        for i in range(5):
            if bingo[i][4-i] != 0:
                daegack -= 1
                break

    return garo+sero+daegack

count = 0
for i in range(25):
    if count >= 3: # 3을 건너뛰고 4개이상의 빙고가 생길 수 있음
        print(i)
        break
    # 새로 만들어지는 빙고수만큼 count에 추가
    count += check(call[i])
