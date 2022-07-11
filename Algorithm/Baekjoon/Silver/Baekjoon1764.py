N, M = map(int, input().split())
mapping = dict()
ans = []
cnt = 0
for n in range(N):
    mapping[input()] = True

for m in range(M):
    I = input()
    #print("보도못해",I)
    if I in mapping:
        cnt += 1
        ans.append(I)
print(cnt)
ans.sort()
for a in ans:
    print(a)