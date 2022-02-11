for t in range(10):
    V,E = list(map(int,input().split()))
    check = [False for i in range(V+1)]
    line = list(map(int,input().split()))
    link = [[] for i in range(V+1)]
    for l in range(0,len(line),2):
        link[line[l+1]].append(line[l])
    answer = []
    def dfs(num):
        check[num] = True
        for i in link[num]:
            if not check[i]:
                dfs(i)
        answer.append(num)
    for num in range(1,V+1):
        if not check[num]:
            dfs(num)
    ans = ''
    for i in answer:
        ans += str(i) + ' '
    print(f'#{t+1} {ans}')
