N = int(input())
land = []
for i in range(6):
    land.append(list(map(int, input().split())))
land.extend(land) #이어 붙이기
for i in range(9): # 반복되는 숫자 검사
    if land[i][0] == land[i+2][0] and land[i+1][0] == land[i+3][0]:
        # i i+1 i+2 i+3
        print(N*((land[i][1]+land[i+2][1])*(land[i+1][1]+land[i+3][1])-land[i+1][1]*land[i+2][1]))
        break
