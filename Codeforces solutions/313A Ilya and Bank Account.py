n = input()
if n[0] != '-':
    print(n)
else:
    nn = min(n[:-1], n[:-2]+n[-1])
    print("0") if len(nn) == 2 and nn[1] == '0' else print(nn)
