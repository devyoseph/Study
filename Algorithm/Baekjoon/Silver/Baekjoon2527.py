def line(x1,x2,x3,x4): # 두 선분의 관계 판단
    # 조건: x1 < x2 , x3 < x4
    if x2 < x3 or x4 < x1: # 만나지 않음
        return 0
    elif x2 == x3 or x1 == x4: # 한 점에서 만남
        return 1
    else:
        return 2 # 겹침

for i in range(4):
    rec = list(map(int,input().split()))
    # x1 y1 x2 y2  x1 y1 x2 y2
    #  0  1  2  3   4  5  6  7
    relationX = line(rec[0],rec[2],rec[4],rec[6])
    relationY = line(rec[1],rec[3],rec[5],rec[7])
    result = relationX*relationY # 곱한 결과값 계산

    if result == 0:
        print('d')
    elif result == 1:
        print('c')
    elif result == 2:
        print('b')
    else:
        print('a')
