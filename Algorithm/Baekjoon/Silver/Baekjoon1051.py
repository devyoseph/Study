N, M = map(int, input().split())
lst = []  # 빈 리스트

# [조건]: N, M은 자연수 = 정답의 최소값은 1, 사각형은 정사각형
MAX = 1

# 사각형이 맞는지 찾아주는 함수
def find_square(number, row, col):
    for colF in range(col, M):  # 같은 행부터 조사( 열을 바꿔야함 )
        if lst[row][colF] == number:
            length = colF - col # 실제길이는 + 1 을 해야하지만 계산을 위해 보류
            if(row + length < N and lst[row+length][col] == num and lst[row+length][col+length]==number):
                area = (length+1) ** 2
                global MAX
                if area > MAX:
                    MAX = area

# 2차원 배열? NO! 문자열!
for i in range(N):
    lst.append(input())

# 브루트 포스: 전체 탐색
# 한 점을 정했을 때 내 앞은 탐색하지 않고 내 뒤만 탐색한다
for i in range(N):
    for j in range(M):
        num = lst[i][j]  # 문자열 저장이지만 형변환? 필요X
        find_square(num, i, j)
        
# 출력
print(MAX)
