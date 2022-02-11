N = int(input())
dice = []
reverse = [5,3,4,1,2,0] # 주사위의 반대편 인덱스를 기록
MAX = 0

def getmax(idx, dice): # 닿는 곳을 제외한 해당 주사위의 최대값을 구함
    for i in range(6,3,-1):	# 최대값은 6,5,4 중 하나
        if i == dice[idx] or i == dice[reverse[idx]]:
            continue
        return i

for i in range(N): # 주사위 정보 기록
    dice.append(list(map(int, input().split()))) 
    
for i in range(1,7): # 주사위의 숫자
    max1 = 0
    now = i
    for j in range(N): # dice의 번호 0 ~ N-1
        idx = dice[j].index(now) # 숫자를 찾아 인덱스 반환
        max1 += getmax(idx, dice[j]) # 최대값 구하기
        now = dice[j][reverse[idx]] # 반대편 숫자를 넣어줌

    if max1 > MAX: # 최대값 갱신
        MAX = max1 
print(MAX)
