fn = int(input())
s = {0: [0, 0, 0], 1: [0, 0, 1], 2: [0, 1, 1]}
n1 = 1
n2 = 2
i = 0
while n1+n2 <= fn:
    i = n1+n2
    s[i] = [0, n1, n2]
    n1 = n2
    n2 = i
print(" ".join(str(x) for x in s[fn]))
