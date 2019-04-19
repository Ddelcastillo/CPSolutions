xys = list(map(int, input().split()))  # x1, y2, x2, y2
bxy = list(map(int, input().split()))  # x, y
n1 = (xys[2]-xys[0])/bxy[0]
n2 = (xys[3]-xys[1])/bxy[1]
if n1 % 1 != 0 or n2 % 1 != 0:
    print("NO")
else:
    if (n1 % 2) != (n2 % 2):
        print("NO")
    else:
        print("YES")
