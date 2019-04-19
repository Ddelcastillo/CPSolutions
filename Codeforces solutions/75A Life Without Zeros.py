a = int(input())
b = int(input())
c = a+b
d = int(str(a).replace('0', '')) + int(str(b).replace('0', ''))
if int(str(c).replace('0', '')) == d:
    print("YES")
else:
    print("NO")
