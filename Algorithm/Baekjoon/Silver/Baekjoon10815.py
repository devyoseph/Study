N = int(input())
card = list(map(int, input().split()))
M = int(input())
problem = list(map(int, input().split()))

counting = [False]*20000001
ans = []
for n in range(N):
    counting[card[n]+10000000] = True

for m in range(M):
    if counting[problem[m]+10000000]:
        ans.append(1)
    else:
        ans.append(0)

print(*ans)