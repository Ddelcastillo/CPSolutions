import math
import sys
N = int(input())
a = int(input())
b = int(input())
# Se simplifican los factores utilizando el gcd de A, B y C.
div = math.gcd(N, math.gcd(a, b))
if div == 1:
    if math.gcd(a, b) != 1:  # Si gcd(a,b) > 1 pero div == 1, ax+by sería entero y C/gcd(a,b) decimal.
        print("NO")
        sys.exit()
else:
    N, a, b = N/div, a/div, b/div
# El algoritmo aumenta en tiempo entre más alejados esten a y b. Por ende, se revisan los casos
# base que podrían hacer que este se demore un exceso de tiempo: 1 y 2 (si N %2 == 0).
if a == 1:
    print("YES")
    print(int(a*N), 0)
    sys.exit()
elif b == 1:
    print("YES")
    print(0, int(b*N))
    sys.exit()
elif N % 2 == 0:
    if a == 2:
        print("YES")
        print(int(N/2), 0)
        sys.exit()
    elif b == 2:
        print("YES")
        print(0, int(N/2))
        sys.exit()
# Si la solución no cubre los peores casos.
r = 0  # Algoritmo de Euclides.
while r*a <= N:
    if (N-(r*a)) % b == 0:
        print("YES")
        print(r, int((N-(r*a))/b))
        sys.exit()
    r += 1
print("NO")
