import math
an = list(map(int, input().split()))
a = int(math.sqrt(an[1]*an[2]/an[0])*an[0]/an[1])
b = int(math.sqrt(an[1]*an[2]/an[0])*an[0]/an[2])
c = int(math.sqrt(an[1]*an[2]/an[0]))
print(str(a*4+b*4+c*4))
