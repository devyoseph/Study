#투 포인터
N,K = map(int,input().split())
day = list(map(int,input().split()))
sum = sum(day[0:K]) # 맨 왼쪽에 길이만큼 합을 구함
MAX = sum # MAX를 갱신
for i in range(N-K):
    sum -= (day[i]-day[i+K]) # 오른쪽으로 움직이면서 맨 왼쪽값을 빼주고 오른쪽 값을 더함
    MAX = max(MAX,sum)
print(MAX)
