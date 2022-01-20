import math
def snail(day, night, height):
    # height에 도달할 때는 day가 night보다 하나 더 많은 상태
    # height <= n*day - (n+1)*night = n(day - night) + night
    # (height - night) / (day - night) = n
    cnt = (height - night) / (day - night)
    return math.ceil(cnt)
lst = list(map(int,input().split()))

print(snail(lst[0],lst[1],lst[2]))
