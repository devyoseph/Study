# 입력 부분
area = list(0 for i in range(1001))
N = int(input())
rod = [list(map(int,input().split())) for i in range(N)]
rod.sort(key=lambda x: x[0]) # 2차원 정렬

MAX = idx = idx_pic = 0 # 막대기 최대값, 그 때 인덱스 (배열, 그림)

for i in range(N):
    if rod[i][1] > MAX:
        MAX = rod[i][1] # 막대기 중 최대값 가장 먼저 나타나는 지점
        idx = i # 최대일 때, 리스트상 인덱스
        idx_pic = rod[i][0] # 최대일 때 그림상 인덱스

max = 0 # 순간 순간의 최대값
for i in range(idx+1): # [2,4] [4, 6]
    if max < rod[i][1]:
        max = rod[i][1]
        for j in range(rod[i][0],idx_pic+1):
            area[j] = max
rod.reverse() # 뒤집고 거꾸로 진행
max = 0 # 초기화
for i in range(len(rod)-idx):
    if max < rod[i][1]:
        max = rod[i][1]
        for j in range(idx_pic,rod[i][0]+1):
            area[j] = max
print(sum(area))
