import math

N, K = list(map(int,input().split()))
ban = [[0,0] for i in range(7)]
total = 0
for i in range(N):
    gender, b = list(map(int,input().split()))
    ban[b][gender] += 1
for i in ban:
    total += math.ceil(i[0]/K) + math.ceil(i[1]/K)
print(total)
