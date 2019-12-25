r = int(input())
q, d = 0, 5
while r >= d:
    q += 1
    r -= d
print(str(q + (0 if r == 0 else 1)))