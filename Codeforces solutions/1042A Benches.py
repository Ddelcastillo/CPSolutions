import math
n = int(input())
m = int(input())
mn = 1000
mx = 0
sm = m
for i in range(n):
    a = int(input())
    sm += a
    if a < mn:
        mn = a
    if a > mx:
        mx = a
kmin = max(mx, int(math.ceil(sm/n)))
kmax = mx + m
print(str(kmin) + ' ' + str(kmax))
