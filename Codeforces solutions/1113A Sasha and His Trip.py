import sys
an = list(map(int, input().split()))
if an[1] >= an[0]-1:
    print(int(an[0]-1))
    sys.exit()
m = an[0]-an[1]-1
print(int(an[1]+m*(m+3)/2))
