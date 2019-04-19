def process_string(s):
    r = ""
    act = s[0]
    cnt = 1
    for i in s[1:]:
        if i != act:
            r += "0 " if act == "1" else "00 "
            r += "0"*cnt + " "
            act = i
            cnt = 1
        else:
            cnt += 1
    r += "0 " if act == "1" else "00 "
    r += "0"*cnt + " "
    return r

message = input()
s = ""
for i in message:
       t = str(bin(ord(i))[2:])
       s += "0"*(7-len(t)) + t
print(process_string(s)[:-1])
