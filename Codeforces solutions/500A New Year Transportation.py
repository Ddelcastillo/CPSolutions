import sys
an = list(map(int, input().split()))
p = list(map(int, input().split()))
t = 1
while t < an[1]:
    t = t+p[t-1]
    if t == an[1]:
        print("YES")
        sys.exit()
print("NO")
