n = int(input())
arr = list(map(int, input().split()))
x = int(input())
arr.sort()
cnt = 0
last = n-1
half = x//2

flag = False
for i in range(n):
    if flag: break
    if arr[i] > half: break
    for j in range(last, i, -1):
        #print(i,j)
        if arr[i] + arr[j] == x:
            cnt += 1
            last = j - 1
            break
        elif arr[i] + arr[j] < x:
            last = j + 1
            if last > n-1: last = n-1
            break
print(cnt)
