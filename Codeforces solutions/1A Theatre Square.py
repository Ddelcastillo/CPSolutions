an = list(map(int, input().split()))
q1, q2 = an[0]/an[2], an[1]/an[2]
t = int(q1) if q1 % 1 == 0 else int(q1) + 1
t *= int(q2) if q2 % 1 == 0 else int(q2) + 1
print(t)
