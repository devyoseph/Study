b1, b2 = map(int, input().split()) # 끝값 넣어주기
N = int(input())
row, col = [0], [0] # 0을 넣은 빈 리스트 만들기
max1 = max2 = 0

for i in range(N): # 자르는 선 번호를 넣어주기
    n, num = map(int, input().split())
    if n == 1:
        row.append(num)
    else:
        col.append(num)
        
# 정렬 후 끝값을 추가하고 각 요소 사이의 최대 길이를 구합니다
def findmax(lst,last):
    max = 0
    lst.sort()
    lst.append(last)
    for i in range(1, len(lst)):
        if lst[i] - lst[i - 1] > max:
            max = lst[i] - lst[i - 1]
    return max

print(findmax(row,b1) * findmax(col,b2))
