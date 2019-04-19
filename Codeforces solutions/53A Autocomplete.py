s = input()
n = int(input())
t = ""
lt = 10**10
for a in range(n):
    x = input()
    if x.startswith(s):
        if t == "":
            t = x
        else:
            if x < t:
                t = x
if t == "":
    print(s)
else:
    print(t)
