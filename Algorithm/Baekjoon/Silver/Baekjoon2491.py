N = int(input())
lst = list(map(int,input().split()))
past = lst[0]
Increase = 1
Decrease = 1
MAX = 0
for i in range(1,N):
    if lst[i] == past:
        Increase += 1
        Decrease += 1
    elif lst[i] > past:
        Increase += 1
        if MAX < Decrease:
            MAX = Decrease
        Decrease = 1
    else:
        Decrease += 1
        if MAX < Increase:
            MAX = Increase
        Increase = 1
    past = lst[i]
print(max(MAX,Increase,Decrease))
