import sys
an = list(map(int, input().split()))
s = str(an[1])  # 'b'
k = 1
n = an[1]
while n > an[0]:
    t = n/2
    u = (n-1)/10
    if t % 1 == 0:
        s = str(int(t)) + " " + s
        k += 1
        n = t
    elif u % 1 == 0:
        s = str(int(u)) + " " + s
        k += 1
        n = u
    else:
        print("NO")
        sys.exit()
    if n == an[0]:
        print("YES")
        print(k)
        print(s)
        sys.exit()
print("NO")
