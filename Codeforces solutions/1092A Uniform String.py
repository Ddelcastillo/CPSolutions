import sys
t = int(sys.stdin.readline())
for i in range(t):
    a = list(map(int, sys.stdin.readline().split()))
    n, k = a[0], a[1]
    c = 0
    s = ''
    for j in range(n):
        s += str(chr(97+c))
        c += 1
        if c >= k:
            c = 0
    print(s)
