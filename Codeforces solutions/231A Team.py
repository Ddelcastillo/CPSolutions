import sys
n = int(sys.stdin.readline())
t = 0
for i in range(n):
    t += 1 if sum(list(map(int, sys.stdin.readline().split()))) >= 2 else 0
print(t)
