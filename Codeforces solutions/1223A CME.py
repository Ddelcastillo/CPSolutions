import math as m
q = int(input())
n, res = 0, 0
for i in range(q):
    n = int(input())
    if n == 2:
        print(2)
    else:
        res = m.ceil(n/2)
        print(int(abs(n-2*res)))