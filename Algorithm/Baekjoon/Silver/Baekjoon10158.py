w, h = list(map(int,input().split()))
p, q = list(map(int,input().split()))
t = int(input())
def get(p,t,w):
    n = (p+t)%(2*w)
    if n<=w:
        return n
    else:
        return 2*w-n
print(get(p,t,w), get(q,t,h))
