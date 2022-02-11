for t in range(int(input())):
    N, K = list(map(int,input().split()))
    s = set(list(range(1,N+1)))
    s2 = set(map(int,input().split()))
    s3 = list(s-s2)
    answer = ''
    for i in s3:
        answer += str(i) + ' '
    print(f'#{t+1} {answer}')
