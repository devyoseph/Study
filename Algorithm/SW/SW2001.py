T = int(input())
for t in range(T):
    MAX = 0
    N, M = list(map(int,input().split()))
    lst = []
    for i in range(N):
        lst.append(list(map(int,input().split())))

    for i in range(N-M+1):
        for j in range(N-M+1):
            sum = 0
            for k in range(M):
                for l in range(M):
                    sum += lst[i+k][j+l]
            if MAX < sum:
                MAX = sum

    print(f'#{t+1} {MAX}')
