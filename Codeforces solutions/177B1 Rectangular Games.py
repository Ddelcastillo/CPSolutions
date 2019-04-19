import sys
import math
n = int(input())
a, b, t = 0, 0, n
f2 = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384,  # factors of 2.
      32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608,
      16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824]
if n in f2:
    print(int(2*2**math.log(n, 2)-1))
    sys.exit()
while n > 1:
    if n in f2:
        print(int(t + 2*2**math.log(n, 2)-1))
        sys.exit()
    if n % 2 == 0:
        t += n/2
        n -= n/2
    else:
        a = 3
        b = n/a
        while b % 1 != 0:
            a += 2
            b = n/a
        n = b
        t += b
print(int(t))
