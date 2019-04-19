import sys
c = sys.stdin.readline().split("\n")[0]
h = sys.stdin.readline().split()
a = True
for i in range(5):
    if h[i][1] == c[1] or h[i][0] == c[0]:
        print("YES")
        a = False
        break
if a:
    print("NO")
