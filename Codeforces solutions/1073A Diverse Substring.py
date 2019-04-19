import sys
n = int(sys.stdin.readline())
s = sys.stdin.readline()[0:-1]
c = True
for i in range(n-1):
    w = s[i:i+2]
    if w[0] != w[1]:
        print("YES")
        print(w)
        c = False
        break
if c:
    print("NO")
