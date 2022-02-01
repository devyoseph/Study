for t in range(10):
    n = input()
    lst = []
    cnt = 0
    for i in range(100):
        lst.append(list(map(int,input().split())))
    for i in range(100): # N = 1, S = 2
        prev = "noting" # 위에서부터 N - S 순서 등장 개수 구하기
        for j in range(100):
            if lst[j][i] == 1:
                prev = "N" # N을 만나면 prev 변경
            elif lst[j][i] == 2:
                if prev == "N": # S를 만나면 이전에 N을 만났는지 확인
                    cnt += 1 # N을 만났다면 카운트 + 1
                prev = "S" # prev 변경
    print(f'#{t+1} {cnt}')
