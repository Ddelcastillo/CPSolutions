import sys
an = list(map(int, input().split()))
t = 0
p1 = max(an)
p2 = min(an)
if p1 == 1 and p2 == 1:
    print(0)
    sys.exit()
while p1 > 0 and p2 > 0:
    if p2 == 100:
        temp = p2
        p2 = p1
        p1 = temp
    p1 -= 2
    p2 += 1
    if p1 <= 2:
        temp = p2
        p2 = p1
        p1 = temp
    t += 1
print(t)
