import sys
n = int(sys.stdin.readline())
t = list(map(int, sys.stdin.readline().split()))
if n <= 2:
    print(0)
else:
    mx = max(t)
    t.remove(mx)
    mx2 = max(t)
    mn = min(t)
    t.remove(mn)
    mn2 = min(t)
    print(mx2-mn) if (mx2-mn) < (mx-mn2) else print(mx-mn2)
