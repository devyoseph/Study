area = set()
for rec in range(4):
    lst = list(map(int,input().split()))
    for x in range(lst[0],lst[2]):
        for y in range(lst[1],lst[3]):
            area.add((x,y))
print(len(area))
