import sys
n, nm, mx, mn, act, same = int(input()), list(), -1, 101, 0, True
an = input().split()
for i in an:
    act = int(i)
    mx = max(mx, act)
    mn = min(mn, act)
    nm.append(act)
    if same and len(nm) > 1 and act != nm[-2]:
        same = False
f1, f2 = (mx-mn)/2, mx-mn
ni1, ni2 = mn+f1, mn+f2
md1, md2 = True, True
# Corto circuitos
if n == 1:
    print(0)
    sys.exit()
if same:
    print(0)
    sys.exit()

if f1 >= 0 and f1 % 1 == 0:
    f1 = int(f1)
    for j in nm:
        if j == ni1:
            continue
        else:
            if j+f1 != ni1 and j-f1 != ni1:
                md1 = False
                break
    if md1:
        print(int(f1))
        sys.exit()
if f2 >= 0 and f2 % 1 == 0:
    for j in nm:
        if j == ni2:
            continue
        else:
            if j+f2 != ni2 and j-f2 != ni2:
                print(-1)
                sys.exit()
    print(int(f2))
else:
    print(-1)


