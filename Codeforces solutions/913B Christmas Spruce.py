import sys
n = int(input())
c = {1: 0}  # Número de hijos
p = {}  # Padres
m = [1]  # Nodos marcados
j, t = 0, 0
for i in range(2, n+1):
    j = int(input())
    # Se asume que el nodo está en el árbol, i.e., el papá existe.
    c[j] += 1
    c[i] = 0
    p[i] = j
    if j not in m:
        m.append(j)
        j = p[j]
        c[j] -= 1
for x in m:
    t = c[x]
    if t < 3:
        print("No")
        sys.exit()
print("Yes")
